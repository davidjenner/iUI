<div id="form-echo" class="panel" title="Form Echo">
  <h2>Req Info</h2>
  <fieldset>
    <div class="row">
        <label>Method</label>
        <span>${request.method}</span>
    </div>
    <div class="row">
        <label>RemoteHost</label>
        <span>${request.remoteHost}</span>
    </div>
  </fieldset>
  <h2>Parameters</h2>
  <fieldset>
    <% for (p in params) { %>
    <div class="row">
        <label>$p.key</label>
        <span>$p.value</span>
    </div>
    <% } %>
  </fieldset>
  <h2>Headers</h2>
  <h2>Use a dl to remind us to add CSS</h2>
  <dl>
    <% for (h in headers) { %>
    <dt>$h.key</dt>
    <dd>$h.value</dd>
    <% } %>
  </dl>
</div>