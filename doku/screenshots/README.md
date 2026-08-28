# Screenshots

Diese Bilder werden im Abgabedokument referenziert. Dateinamen exakt so verwenden:

| Datei | Was darauf zu sehen sein muss |
|---|---|
| `01_lokales_verzeichnis.png` | Explorer/Terminal in `C:\Code\324\MultiModuleMavenProject` mit `pom.xml`, `app_main`, `greeter_lib`, `.gitmodules` |
| `02_github_parent_repo.png` | GitHub-Repo `m324-multimodule` — `greeter_lib` erscheint als Submodul-Link mit Commit-Hash |
| `03_github_greeter_repo.png` | GitHub-Repo `m324-greeter-lib` mit dem Bibliothekscode |
| `04_intellij_projektstruktur.png` | IntelliJ mit Projektbaum und geoeffnetem Maven-Tool-Window (beide Module sichtbar) |
| `05_code_greet_aufruf.png` | `Main.java` mit `import ch.modul324.greeter.Greeter;` und dem `greeter.greet(...)`-Aufruf |
| `06_gitmodules_datei.png` | Inhalt der Datei `.gitmodules` |
| `07_mvn_install_output.png` | Terminal mit `mvn clean install` und der Reactor Summary / BUILD SUCCESS |
| `08_m2_repository_greeter_lib.png` | Explorer in `C:\Users\john-\.m2\repository\ch\modul324\greeter_lib\1.0-SNAPSHOT` |
