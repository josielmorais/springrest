CREATE TABLE public.cliente
(
  id bigint NOT NULL,
  nome character varying(60),
  email character varying(255),
  telefone character varying(20),
  
  CONSTRAINT cliente_pkey PRIMARY KEY (id)
)