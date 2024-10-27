import java.util.Date;

public class Period {
    private final Date start ;
    private final Date end ;
    /* *
     * @param start the beginning of the period
     * @param end the end of the period ; must not precede start
     * @throws I l l e g a l A r g u m e n t E x c e p t i o n if start is after end
     * @throws N u l l P o i n t e r E x c e p t i o n if start or end is null
     */
    public Period ( Date start , Date end ) {
        this . start = new Date ( start . getTime () ) ;
        this . end = new Date ( end . getTime () ) ;
        if ( this . start . compareTo ( this . end ) > 0)
            throw new IllegalArgumentException ( start + " after " +
                end ) ;
    }
    public Date start () { return new Date ( start . getTime () ) ; }
    public Date end () { return new Date ( end . getTime () ) ; }
    public String toString () { return start + " - " + end ; }
}
