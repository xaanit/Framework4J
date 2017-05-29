Features
---
* [ ] Command handling
  * [ ] Command objects w lots of info: keyword, uses prefix, allowed in PMs, permissions??, argument format???, allow bots to use it?, short help, full help, usage
    [ ] Constructor, builder pattern, factory pattern, extensible abstract class pattern
    [ ] Easy aliasing
    [ ] Per guild prefixes
  [ ] Permissions handling
  [ ] Automated update/restart

Basic Design
---
abstract class Command
  default impl CommandImpl extends Command

