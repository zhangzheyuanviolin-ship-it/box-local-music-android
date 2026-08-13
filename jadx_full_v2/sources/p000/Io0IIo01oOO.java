            package p000;
            
/* 27 */    public final class Io0IIo01oOO extends I01O1lIi {
                public static final Io0IIo01oOO I00iiI = new Io0IIo01oOO(3);
                public static final Io0IIl111I0 I00iiO = new Io0IIl111I0();

                @Override
                public final void I00li1OI(O0oiO0ilooli o0oiO0ilooli) {
/* 3 */             if (!(o0oiO0ilooli instanceof IiI00001oI)) {
/* 18 */                IioIoO10iOiI.I000o00OoI0I(o0oiO0ilooli, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
/* 29 */                return;
                    }
/* 5 */             IiI00001oI iiI00001oI = (IiI00001oI) o0oiO0ilooli;
/* 7 */             Io0IIl111I0 io0IIl111I0 = I00iiO;
/* 9 */             iiI00001oI.onStart(io0IIl111I0);
/* 12 */            iiI00001oI.onResume(io0IIl111I0);
                }

                @Override
                public final O0oOi0I I00ol1() {
/* 1 */             return O0oOi0I.I00ilI0I1;
                }

                public final String toString() {
/* 1 */             return "coil.request.GlobalLifecycle";
                }

                @Override
/* 28 */        public final void I00ooIo0(O0oiO0ilooli o0oiO0ilooli) {
                }
            }
