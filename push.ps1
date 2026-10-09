$git = "C:\Users\laksh\AppData\Local\Microsoft\WinGet\Packages\Git.MinGit_Microsoft.Winget.Source_8wekyb3d8bbwe\cmd\git.exe"
Set-Location "C:\Users\laksh\.gemini\antigravity\scratch\VehicleRentalSystem"
& $git add -A
& $git commit -m "Extracted first part Vehicle.java cleanly"
& $git push origin main
& $git log -1 --stat
