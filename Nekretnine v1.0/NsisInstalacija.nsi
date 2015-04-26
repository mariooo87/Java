Name "Nekretnine_v1.0"+++++++-
OutFile "nekretnine_instalacija.exe"
InstallDir $PROGRAMFILES\Nekretnine
Section
    SetOutPath $INSTDIR
    File /nonfatal /a /r "dist\" 
    File /nonfatal /a /r "Start.bat" 
    File /nonfatal /a /r "konfiguracija.properties" 
    CreateDirectory $INSTDIR\pictures
    SetOutPath $INSTDIR\pictures
    File /nonfatal /a /r "pictures\" 
    CreateDirectory $INSTDIR\reports
    SetOutPath $INSTDIR\reports
    File /nonfatal /a /r "reports\" 
    CreateShortCut "$SMPROj*-GRAMS\Nekretnine_v1.0.lnk" "$INSTDIR\Start.bat"
SectionEnd