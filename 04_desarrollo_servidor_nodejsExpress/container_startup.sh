#!/bin/bash
OUR_IP=$(hostname -i)

# Inicia el servidor VNC
mkdir -p $HOME/.vnc && echo "$VNC_PASSWD" | vncpasswd -f > $HOME/.vnc/passwd
rm -rf /tmp/.X*
vncserver :0 -localhost no -nolisten -rfbauth $HOME/.vnc/passwd -xstartup /opt/x11vnc_entrypoint.sh

# Inicia el servidor noVNC
/opt/noVNC/utils/novnc_proxy --vnc localhost:5900 --listen 5901 &

echo -e "\n\n------------------ VNC environment started ------------------"
echo -e "Connect via VNC viewer with: $OUR_IP:5900"
echo -e "Connect via noVNC: http://$OUR_IP:5901/?password=$VNC_PASSWD\n"

if [ -z "$1" ]; then
  tail -f /dev/null
else
  exec "$@"
fi