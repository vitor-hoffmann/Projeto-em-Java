# Shein
Este repositório é destinado para o projeto do curso de Orientação a Objetos da Universidade de Brasília
Para executa-lo, apenas abra o repositorio no cmd e digite o comando "java -jar shein.jar"


# Git Flow 

O Git Flow é uma metodologia poderosa e versátil que capacita as equipes a trabalhar de forma colaborativa e organizada no desenvolvimento de projetos. É uma abordagem que oferece diretrizes claras para o fluxo de trabalho com o Git, permitindo uma melhor organização do código, controle de versões e colaboração entre os membros da equipe. <br>

Além disso, o Git Flow permite que todos os membros da equipe trabalhem em paralelo, desenvolvendo diferentes funcionalidades ou correções de bugs, e depois integrem suas contribuições de forma harmoniosa. Isso significa que os integrantes têm o poder de influenciar positivamente o fluxo de trabalho, compartilhando suas ideias e perspectivas únicas para melhorar o processo de desenvolvimento. <br>

## Branch Master
A branch master é a branch principal antes de ser enviado o projeto para a Main e deve conter apenas código estável e pronto para implantação na Main. Ela não deve receber commits diretos, deve se passar pela sua Branch específica do projeto, apos a finalização, envia para a Branch Master e deve-se esperar as outras partes do projetos das outras Branches específicas, assim, após a junção de todo o código estável de todas as Branches, fazemos o merge com a Main
 *Caminho*
Commit do seu progresso na **Branch específica do projeto** --> Após a finalização das atividades/issues da Branch específica do projeto, enviar para a **Branch Master** --> Após a finalização de todo o projeto, enviamos para a **Main** e fazemos os testes finais

## Branches de Feature / Branch específica do projeto: 
Cada nova funcionalidade ou feature a ser implementada no projeto deve ter sua própria branch de feature. As branches de feature devem ter nomes descritivos e relacionados à funcionalidade em questão, por exemplo “Branch-Produto", onde implementaremos a classe Produto e faremos suas correções.

 *Como criar o nome da sua Branch específica*
Coloque o nome “Branch” no início, adicionando um traço “ - “ e por fim, uma palavra específica que defina qual o objetivo principal a ser feito naquela branch! Como os exemplos citados acima.
SEMPRE, antes de trabalhar na branch específica do seu projeto, deem **Git Pull** antes de qualquer alteração que queiram fazer

## No Git Flow, existem algumas linhas de código importantes que desempenham um papel fundamental no fluxo de trabalho. Aqui estão algumas delas:
git clone: Essa linha de código é usada para clonar um repositório Git existente para o seu ambiente de desenvolvimento local. É útil quando você deseja começar a contribuir para um projeto existente. <br>
git branch: Essa linha de código permite criar, listar ou excluir branches. No Git Flow, os branches são usados para separar o trabalho em diferentes recursos ou tarefas. É importante criar branches específicas para cada funcionalidade ou correção de bug. <br>
git checkout: Essa linha de código é usada para alternar entre branches. É comum alternar para um branch específico antes de começar a trabalhar em uma nova funcionalidade ou correção. <br>
git add .: Essa linha de código permite adicionar arquivos ao próximo commit. É importante selecionar apenas os arquivos relevantes para a funcionalidade ou correção que está sendo desenvolvida. <br>
git commit: Essa linha de código é usada para criar um novo commit, registrando as alterações feitas nos arquivos. Cada commit deve ser claro e descritivo, indicando o que foi alterado e por quê. <br>
git push: Essa linha de código é usada para enviar os commits locais para um repositório remoto. É essencial fazer push regularmente para manter o repositório atualizado e permitir que outros membros da equipe acessem as alterações. <br>
git pull: Essa linha de código é usada para buscar as alterações mais recentes de um repositório remoto e mesclá-las com o seu branch local. É útil quando você deseja atualizar seu ambiente de trabalho com as alterações feitas por outros membros da equipe. <br>

## Como deve ser feita a revisão das branches, criando o pull request e como fazer isso no git, como revisar e quando se pode dar merge com a main?
A revisão das branches no Git geralmente é feita por meio do uso de pull requests. Aqui está um passo a passo sobre como fazer a revisão das branches, criar um pull request e, em seguida, revisar e decidir quando realizar o merge com a branch principal, como a main:
Criação do pull request:
Após finalizar o desenvolvimento em uma branch, faça o push dessa branch para o repositório remoto.
Acesse o repositório e navegue até a página onde estão listadas as branches.
Selecione a branch que deseja mesclar com a branch principal.
Procure pelo botão "New pull request" ou similar e clique nele para criar um novo pull request.

Descrição do pull request:
No formulário de criação do pull request, adicione uma descrição clara e concisa do que foi feito na branch e qual é o objetivo dessa contribuição.
Se necessário, adicione links, referências ou qualquer informação relevante para ajudar na revisão.

Revisão do pull request:
Com o pull request criado, outros membros da equipe poderão visualizá-lo, analisar as alterações e fazer comentários.
A equipe pode fazer perguntas, sugerir melhorias, apontar erros ou qualquer outra observação relevante.
O autor do pull request deve responder aos comentários e esclarecer quaisquer dúvidas levantadas.

Testes e revisão do código:
Antes de fazer o merge, é importante realizar testes nas alterações propostas no pull request.
Os revisores devem verificar se o código está seguindo as boas práticas de programação, se está bem documentado e se atende aos requisitos definidos.

Aprovação e merge:
Após a revisão completa e a correção de quaisquer problemas encontrados, os revisores podem aprovar o pull request.
O autor do pull request pode então proceder com o merge, combinando as alterações da branch do pull request com a branch principal (por exemplo, a main).
Verifique se não há conflitos durante o merge e, se houver, resolva-os adequadamente.

Remoção da branch:
Após o merge, a branch do pull request pode ser excluída, se não for mais necessária.

