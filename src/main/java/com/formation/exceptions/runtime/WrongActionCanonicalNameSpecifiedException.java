package com.formation.exceptions.runtime;

/**
 * Exception lancée quand un mauvais nom canonique d'Action est spécifié dans le
 * fichier de configuration.
 * @author filippo
 */
public class WrongActionCanonicalNameSpecifiedException
        extends
        RuntimeException
{
    /**
     * Le message de l'exception.
     */
    private String message;

    /**
     * Constructeur le plus simple.
     * @param pMessage
     *        Le message de l'exception.
     */
    public WrongActionCanonicalNameSpecifiedException(String pMessage)
    {
        super();
        this.message = pMessage;
    }

    /**
     * Pour pouvoir chaîner les Exceptions.
     * @param pMessage
     *        Le message de l'exception.
     * @param throwable
     *        Exception Reprise.
     */
    public WrongActionCanonicalNameSpecifiedException(String pMessage, Throwable throwable)
    {
        super();
        this.message = pMessage + "\nCaused by :" + throwable.getMessage();
    }

    /**
     * Pour pouvoir chaîner les Exceptions.
     * @param throwable
     *        Exception Reprise.
     */
    public WrongActionCanonicalNameSpecifiedException(Throwable throwable)
    {
        super();
        this.message = throwable.getMessage();
    }

    /**
     * Getter du message.
     * @return Le message de l'Exception
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Setter du message.
     * @param pMessage
     *        Le message de l'Exception
     */
    public void setMessage(String pMessage)
    {
        this.message = pMessage;
    }

}
