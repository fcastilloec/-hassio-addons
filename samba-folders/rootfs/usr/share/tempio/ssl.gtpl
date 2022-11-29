[ssl]
   browseable = yes
   writeable = yes
   path = /ssl

   valid users = {{ .username }}
   force user = root
   force group = root
   veto files = /{{ .veto_files | join "/" }}/
   delete veto files = {{ eq (len .veto_files) 0 | ternary "no" "yes" }}
