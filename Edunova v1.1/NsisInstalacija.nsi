Name "Edunova10"+++++++-
OutFile "instalacija.exe"
InstallDir $PROGRAMFILES\Edunova10
Section
    SetOutPath $INSTDIR
    File /nonfatal /a /r "dist\" 
    File /nonfatal /a /r "Start.bat" 
    File /nonfatal /a /r "konfiguracija.properties" 
    CreateDirectory $INSTDIR\slike
    SetOutPath $INSTDIR\slike
    File /nonfatal /a /r "slike\" 
    CreateDirectory $INSTDIR\reports
    SetOutPath $INSTDIR\reports
    File /nonfatal /a /r "reports\" 
    CreateShortCut "$SMPROj*-GRAMS\Edunova10.lnk" "$INSTDIR\Start.bat"
SectionEnd