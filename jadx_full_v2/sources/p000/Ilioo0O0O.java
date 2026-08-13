            package p000;

            import android.media.Image;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public abstract class Ilioo0O0O implements IoiO1IO1I1i {
                public final IoiO1IO1I1i I00iiI;
                public final Object I00iOIl = new Object();
                public final HashSet I00iiO = new HashSet();

                public Ilioo0O0O(IoiO1IO1I1i ioiO1IO1I1i) {
/* 18 */            this.I00iiI = ioiO1IO1I1i;
                }

                public final void I00000oIO(Iliol1ioii0i iliol1ioii0i) {
                    synchronized (this.I00iOIl) {
/* 6 */                 this.I00iiO.add(iliol1ioii0i);
                    }
                }

                @Override
                public int I0000O() {
/* 3 */             return this.I00iiI.I0000O();
                }

                @Override
                public int I0001Ioi1lo() {
/* 3 */             return this.I00iiI.I0001Ioi1lo();
                }

                @Override
                public IoiO11I0o0o1[] I00111O() {
/* 3 */             return this.I00iiI.I00111O();
                }

                @Override
                public IoiIIlOol1 I00i0oil() {
/* 3 */             return this.I00iiI.I00i0oil();
                }

                @Override
                public final Image I00ll1() {
/* 3 */             return this.I00iiI.I00ll1();
                }

                @Override
                public void close() throws Exception {
                    HashSet hashSet;
/* 3 */             this.I00iiI.close();
                    synchronized (this.I00iOIl) {
/* 13 */                hashSet = new HashSet(this.I00iiO);
                    }
/* 17 */            Iterator it = hashSet.iterator();
/* 25 */            while (it.hasNext()) {
/* 33 */                ((Iliol1ioii0i) it.next()).I00000oIO(this);
                    }
                }

                @Override
                public final int getFormat() {
/* 3 */             return this.I00iiI.getFormat();
                }
            }
