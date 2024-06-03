package main.java.br.com.descomplica.projetospringboot.controller;

@RestController
@RequestMapping("/aluno")
public class AlunoControler {
  @GetMapping
  public ResponseEntity<List<Aluno>> getAllAlunos() {
    //implementar
    return new ResponseEntity<>(listaALunos, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Aluno> getAlunoById(@PathVariable Integer id) {
    //implementar
    return new ResponseEntity<>(aluno, HttpStatus.OK);
  }

  @PortMapping
  public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno) {
    // implementar
    return new ResponseEntity<>(novoAluno, HttpStatus.CREATED);
  }
}
