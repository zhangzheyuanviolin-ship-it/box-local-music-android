            package p000;

            import java.lang.invoke.VarHandle;
            import sun.misc.Unsafe;
            
            public abstract class O010olO extends O1I0iI implements IiiOlIiio, Iol0IO {
                public O011OOl11 I00iio;

                @Override
                public final void I00000oOI() {
                    Object objI00Io1o110i;
/* 1 */             O011OOl11 o011OOl11I000lI = I000lI();
/* 26 */            do {
/* 5 */                 objI00Io1o110i = o011OOl11I000lI.I00Io1o110i();
/* 11 */                if (objI00Io1o110i instanceof O010olO) {
/* 13 */                    if (objI00Io1o110i != this) {
/* 113 */                       return;
                            }
                        } else {
/* 31 */                    if (!(objI00Io1o110i instanceof Iol0IO) || ((Iol0IO) objI00Io1o110i).I0000O() == null) {
/* 113 */                       return;
                            }
                            while (true) {
/* 41 */                        Object objI000OOo1O = this.I000OOo1O();
/* 47 */                        if (objI000OOo1O instanceof Oi00o1O0Io) {
/* 113 */                           return;
                                }
/* 50 */                        if (objI000OOo1O == this) {
/* 54 */                            return;
                                }
/* 56 */                        O1I0iI o1I0iI = (O1I0iI) objI000OOo1O;
/* 58 */                        Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 60 */                        long j = O1I0iI.I00iiO;
/* 66 */                        Oi00o1O0Io oi00o1O0Io = (Oi00o1O0Io) unsafe.getObjectVolatile(o1I0iI, j);
/* 68 */                        if (oi00o1O0Io == null) {
/* 72 */                            oi00o1O0Io = new Oi00o1O0Io();
/* 75 */                            oi00o1O0Io.I00000oIO = o1I0iI;
/* 77 */                            VarHandle.storeStoreFence();
/* 80 */                            unsafe.putObjectVolatile(o1I0iI, j, oi00o1O0Io);
                                }
/* 86 */                        O010olO o010olO = this;
/* 91 */                        if (unsafe.compareAndSwapObject(o010olO, O1I0iI.I00iOIl, objI000OOo1O, oi00o1O0Io)) {
/* 93 */                            o1I0iI.I000II();
/* 96 */                            return;
                                }
/* 97 */                        this = o010olO;
                            }
                        }
/* 26 */            } while (!I1Ioolli0l0o.I00000oIO.compareAndSwapObject(o011OOl11I000lI, O011OOl11.I00iiI, objI00Io1o110i, O011OiI01.I000II));
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return true;
                }

                @Override
                public final OIIliOii0OoI I0000O() {
/* 1 */             return null;
                }

                public final O011OOl11 I000lI() {
/* 1 */             O011OOl11 o011OOl11 = this.I00iio;
/* 3 */             if (o011OOl11 != null) {
/* 5 */                 return o011OOl11;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("job");
/* 29 */            throw null;
                }

                public abstract boolean I000o00OoI0I();

                public abstract void I000oI1ioi(Throwable th);

                public O010OIi getParent() {
/* 1 */             return I000lI();
                }

                @Override
                public final String toString() {
/* 47 */            return getClass().getSimpleName() + '@' + Ii1Oo1l.I00000oIO(this) + "[job@" + Ii1Oo1l.I00000oIO(I000lI()) + ']';
                }
            }
