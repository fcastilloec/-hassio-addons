[global]
   netbios name = {{ env "HOSTNAME" }}
   workgroup = {{ .workgroup }}
   server string = Samba Home Assistant

   security = user
   ntlm auth = yes

   load printers = no
   disable spoolss = yes

   log level = 1

   bind interfaces only = yes
   interfaces = 127.0.0.1 {{ .interfaces | join " " }}
   hosts allow = 127.0.0.1 {{ .allow_hosts | join " " }}

   {{ if .compatibility_mode }}
   client min protocol = NT1
   server min protocol = NT1
   {{ end }}

   mangled names = no
   dos charset = CP850
   unix charset = UTF-8
