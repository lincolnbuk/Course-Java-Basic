public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Caleu");
        //contato.setEndereco("Smithfield");
        //contato.setTelefone("81 99999-8888");

        //relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Star Wars");
        end.setNumero("n/a");
        end.setComplemento("Close to the moon");
        end.setCidade("Smithfield");
        end.setEstado("California");
        end.setCep("53437320");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone fone = new Telefone();
        fone.setTipo("celular");
        fone.setDdd("81");
        fone.setNumero("99999-8888");

        Telefone fone2 = new Telefone();
        fone2.setTipo("residencial");
        fone2.setDdd("81");
        fone2.setNumero("3434-6884");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = fone;
        telefones[1] = fone2;

        //contato.setTelefone(fone);
        contato.setTelefones(telefones);

        //Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
