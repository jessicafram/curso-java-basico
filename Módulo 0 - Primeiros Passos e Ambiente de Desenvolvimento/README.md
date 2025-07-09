 Curso de Java Básico: Módulo 0 - Primeiros Passos e Ambiente de Desenvolvimento
Bem-vindo(a) ao mundo da programação Java!

Este repositório contém os materiais e guias para o Módulo 0 do nosso Curso de Java Básico. Este módulo é crucial para garantir que seu computador esteja pronto para programar em Java, cobrindo o que você precisa, onde baixar e como instalar as ferramentas essenciais.

Visão Geral do Curso
Este curso foi cuidadosamente pensado para você que nunca programou em Java (ou em qualquer outra linguagem!). Vamos começar do absoluto zero, garantindo que você tenha todo o suporte necessário para dar os primeiros passos e construir suas primeiras aplicações.

Aprenderemos a programar em Java utilizando duas das ferramentas mais populares e poderosas para desenvolvimento: Eclipse IDE e Apache NetBeans IDE.

Módulo 0: Primeiros Passos e Ambiente de Desenvolvimento
0.1. Pré-requisitos para o Curso
Para ter uma experiência tranquila neste curso, os requisitos são mínimos:

💻 Computador: Um computador (desktop ou notebook) com sistema operacional Windows, macOS ou Linux.

🌐 Conexão à Internet: Para baixar os softwares necessários.

💾 Espaço em Disco: Pelo menos 5-10 GB de espaço livre em disco para as instalações e projetos.

🧠 Memória RAM: Mínimo de 4 GB de RAM (8 GB ou mais é recomendado para uma experiência mais fluida com as IDEs).

🔑 Usuário Administrador: Acesso a uma conta de usuário com permissões de administrador no seu sistema operacional para instalar os programas.

🧘 Paciência e Curiosidade: A programação é uma jornada de aprendizado contínuo!

0.2. Ferramentas Essenciais: O que Precisamos Baixar?
Para desenvolver em Java, precisamos de dois componentes principais: o Java Development Kit (JDK) e uma IDE (Ambiente de Desenvolvimento Integrado).

1. Java Development Kit (JDK)
O que é? O JDK é o "kit de ferramentas" que contém tudo o que você precisa para escrever, compilar e executar programas Java. Ele inclui o Java Runtime Environment (JRE), que é a máquina virtual Java (JVM) e as bibliotecas essenciais.

Por que precisamos? Sem o JDK, seu computador não entende a linguagem Java. Ele é a base para qualquer desenvolvimento Java.

Qual versão baixar? Recomenda-se baixar a versão mais recente do Java LTS (Long-Term Support). Atualmente, a versão LTS mais popular e estável é o Java 17 (JDK 17) ou o Java 21 (JDK 21).

Onde baixar? O site oficial para download do JDK é o da Oracle:

Link: https://www.oracle.com/java/technologies/downloads/

Passos Gerais de Download: No site, selecione a aba correspondente ao seu sistema operacional (Windows, macOS ou Linux), localize o "JDK" (não o "JRE" ou apenas "Java SE Runtime Environment") e baixe o instalador adequado (ex: .exe para Windows, .dmg para macOS, .deb ou .rpm para Linux).

Guia Visual de Download (Exemplo JDK 21):

Acesse a página de downloads do Java no site da Oracle.

Certifique-se de que a aba "Java 21" esteja selecionada.

Role a página para baixo para encontrar as opções de download.

Escolha seu Sistema Operacional (Windows, macOS ou Linux).

Procure pela opção "JDK Installer" e clique no link de download ao lado do instalador.

Aguarde a conclusão do download do arquivo do instalador.

Instalação: Após o download, execute o instalador e siga os passos (geralmente "Next", "Next", "Install", "Finish"). Permissões de administrador serão necessárias.

Verificando a Instalação do JDK 21 via Prompt de Comando (CMD)

Este processo é crucial para garantir que as ferramentas do Java (javac e java) estão acessíveis a partir de qualquer diretório no seu sistema.

Abra o Prompt de Comando (CMD):

Clique no botão Iniciar (ícone do Windows).

Digite cmd na barra de pesquisa e clique em "Prompt de Comando".

No Prompt de Comando, digite o seguinte comando e pressione Enter:

java -version

Lembre-se do espaço antes do traço.

Em seguida, digite:

javac -version

javac indica que seu Java está compilando.

Resolução de Problemas: Se os comandos não funcionarem (ex: ""java' não é reconhecido..."), isso significa que o sistema operacional não encontrou o Java em sua variável de ambiente Path. A configuração manual das variáveis de ambiente (JAVA_HOME e Path) será necessária, o que pode ser abordado em uma aula separada.

2. IDEs (Ambientes de Desenvolvimento Integrado)
IDEs são softwares que fornecem um ambiente completo para programação, incluindo editor de código, compilador, depurador e outras ferramentas que agilizam o desenvolvimento.

2.1. Eclipse IDE for Java Developers
O que é? Uma das IDEs mais populares e robustas para desenvolvimento Java, conhecida por sua extensibilidade e vasta comunidade.

Qual versão baixar? Recomenda-se a versão "Eclipse IDE for Java Developers".

Onde baixar? Site oficial do Eclipse Foundation:

Link: https://www.eclipse.org/downloads/

Passos Gerais de Download: Clique em "Download Packages", role para baixo e procure por "Eclipse IDE for Java Developers". Selecione o link de download para o seu sistema operacional.

Instalação: Siga os passos do instalador (geralmente "Next", "Next", "Next", "Finish").

2.2. Apache NetBeans IDE
O que é? Outra IDE poderosa e intuitiva, especialmente boa para iniciantes por sua organização de projetos e suporte visual.

Qual versão baixar? A versão mais recente do Apache NetBeans.

Onde baixar? Site oficial do Apache NetBeans:

Link: https://netbeans.apache.org/download/index.html

Passos Gerais de Download: Clique no botão de download da versão mais recente (ex: "Apache NetBeans 21" ou superior) e, na página seguinte, selecione o instalador para o seu sistema operacional. Procure por links que terminam em .exe (Windows), .dmg (macOS) ou .deb (Linux).

Este README.md serve como um guia completo para configurar seu ambiente de desenvolvimento Java. Siga os passos cuidadosamente e você estará pronto(a) para codificar!

Para quaisquer dúvidas, sinta-se à vontade para abrir uma issue ou entrar em contato.