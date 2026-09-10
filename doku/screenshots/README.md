# Screenshots

Alle Bilder wurden am 10.09.2026 auf dem in der Doku genannten Rechner aufgenommen und werden im Abgabedokument referenziert.

| Datei | Inhalt |
|---|---|
| `01_lokales_verzeichnis.png` | Explorer in `C:\Code\324\MultiModuleMavenProject` (`pom.xml`, `app_main`, `greeter_lib`, `.gitmodules`) |
| `02_github_parent_repo.png` | GitHub-Repo `m324-multimodule`, `greeter_lib` als Submodul-Link mit Commit-Hash |
| `03_github_greeter_repo.png` | GitHub-Repo `m324-greeter-lib` |
| `05_code_greet_aufruf.png` | IntelliJ: Projektbaum mit beiden Modulen, `Main.java` mit Import und `greet()`-Aufruf |
| `06_gitmodules_datei.png` | `.gitmodules`, `git ls-files --stage` (gitlink 160000), `git submodule status` |
| `07_mvn_install_output.png` | `mvn clean install` mit Reactor Summary und Ausführung des JAR |
| `08_m2_repository_greeter_lib.png` | Explorer in `~\.m2\repository\ch\modul324\greeter_lib\1.0.0` |
| `09_github_packages.png` | GitHub Packages des Repos `m324-greeter-lib` mit `ch.modul324.greeter_lib` |
| `10_mvn_deploy.png` | `mvn clean deploy` nach GitHub Packages |
| `11_consumer_download_und_run.png` | Konsument: Download von GitHub Packages und Ausführung |
| `12_github_consumer_repo.png` | GitHub-Repo `m324-greeter-consumer` |
