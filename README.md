HtmlToJavaWindowsBuilder
========================

##SOFTWARE DEVELOPMENT FOR LARGE AND OPEN SOURCE PROJECTS
### HW1  

####使用方法:  

1.  **安裝Eclipse**  
    先下載[Eclipse](http://www.eclipse.org/downloads/)，建議使用[Eclipse Classic 4.2.1](http://www.eclipse.org/downloads/packages/eclipse-classic-421/junosr1)，點選Windows 32 Bit or Windows 64 Bit下載
2.  **安裝Egit**  
    最上面一排點選Help -> Install New Software -> Add-> Name[Egit] Location[http://download.eclipse.org/egit/updates] -> 點選OK -> 勾選Eclipse Git Team Provider以及JGit -> next...finish
3.  **"Import" Github上的repository**    
    File -> import -> Git -> Projects from Git -> URI -> URI填入https://github.com/HtmlToJavaWindowsBuilder/HtmlToJavaWindowsBuilder.git -> next到底 -> finish  
    附上[教學網址](http://puremonkey2010.blogspot.tw/2012/05/eclipse-plugin-egit-github-import.html)
4.  **check out branch hw1**  
    在Package Explore裡的Project上點右鍵 -> Team -> Switch to -> Other -> Remote Tracking -> origin/hw1 -> 點選check out
5.  **Unit Test**    
    Project裡的test資料夾 -> (default package) -> AllTests.java上點右鍵 -> Run As -> JUnit Test