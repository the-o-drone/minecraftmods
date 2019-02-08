cd /d c:\minecraft\server
git add .
git commit -am "Updates as of %date:~10,4%%date:~7,2%%date:~4,2% %time:~0,2%%time:~3,2%%time:~6,2%"
git push origin master