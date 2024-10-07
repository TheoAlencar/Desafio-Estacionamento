����   B �
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  9DesafioIncode/DesafioEstacionamento/MaquinaEstacionamento
  	 
    out Ljava/io/PrintStream;  "
--- Sistema de Estacionamento ---
       java/io/PrintStream println (Ljava/lang/String;)V " 1. Emitir Ticket (R$10.00) $ 2. Pagar Ticket & 3. Consultar Saldo ( 4. Verificar Status do Ticket * 5. Sair , Escolha uma opção (1-5): 
  . /   print
  1 2 3 nextInt ()I 5 CErro: Opção inválida. Por favor, escolha um número entre 1 e 5. 7  java/util/InputMismatchException 9 BErro: Entrada inválida. Por favor, insira um número entre 1 e 5.
  ; < = next ()Ljava/lang/String;
  ? @ A emitirTicket .()LDesafioIncode/DesafioEstacionamento/Ticket;
 C D E F 3 *DesafioIncode/DesafioEstacionamento/Ticket 	getNumero   H I J makeConcatWithConstants (I)Ljava/lang/String; L Informe o número do ticket:  N +Erro: Por favor, insira um número válido.
  P Q R pagarTicket (I)Z T Ticket pago com sucesso! V AFalha no pagamento. Verifique se o ticket existe ou já foi pago.
  X Y Z consultarSaldo ()D  \ I ] (D)Ljava/lang/String;
  _ ` J verificarStatusTicket b Encerrando o sistema...
  d e  close g (DesafioIncode/DesafioEstacionamento/Main Code LineNumberTable LocalVariableTable this *LDesafioIncode/DesafioEstacionamento/Main; main ([Ljava/lang/String;)V e "Ljava/util/InputMismatchException; ticket ,LDesafioIncode/DesafioEstacionamento/Ticket; numero I opcao args [Ljava/lang/String; scanner Ljava/util/Scanner; maquina ;LDesafioIncode/DesafioEstacionamento/MaquinaEstacionamento; rodando Z StackMapTable 
SourceFile 	Main.java BootstrapMethods � Ticket emitido! Número:  � Saldo total: R$ �
 � � � I � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! f           h   /     *� �    i        j        k l   	 m n  h  9    w� Y� 	� L� Y� M>�\� � � !� � #� � %� � '� � )� 6� 	� :� +� -+� 06� 	� � 4� ���:� 8� +� :W����     �         #   <   �   �   �,� >:� � B� G  � � �6� &� K� -+� 06���:� M� +� :W���,� O� � S� � e� U� � Z� ,� W� [  � � H6� &� K� -+� 06���:� M� +� :W��ڲ ,� ^� � � a� >���+� c�  X z } 6 � � � 63AD 6  i   � 8     	  
     !  )  1  9  A  I  L  X  `  f  r  z " }     � ! � " � % � ' � ( � ) � , � - � / � 0 � 4 � 1 � 2 � 3 � 4 � 7 8 : < ?' @* C- D3 F; GA KD HF IN JS KV Nb Oe Rm So Vr Xv Y j   p    o p  �  q r  �  o p  � H s t F  o p - 8 s t  L# u t   w v w   l x y  d z {  b | }  ~   : �   � 6B 6$�  V 6� 
�  V 6� � 	      � �     �  � �  � �   
  � � � 