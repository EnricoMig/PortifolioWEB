// Função para carregar as novidades
window.onload = function() {
    fetch('/output') // A URL para a servlet
      .then(response => response.json())
      .then(data => {
        const novidadesLista = document.getElementById('novidades-lista');
        data.forEach(novidade => {
          const div = document.createElement('div');
          div.classList.add('novidade-item');
          div.innerHTML = `
            <h3>${novidade.titulo}</h3>
            <p>${novidade.conteudo}</p>
            <small>${novidade.data}</small>
          `;
          novidadesLista.appendChild(div);
        });
      })
      .catch(error => console.error('Erro ao carregar as novidades:', error));
  };
  