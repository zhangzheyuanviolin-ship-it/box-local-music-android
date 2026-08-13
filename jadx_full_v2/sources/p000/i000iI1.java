            package p000;

            import java.lang.ref.WeakReference;
            import java.util.Set;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class i000iI1 extends O00IIol {
                public O00IOI11 I00000oOI;
                public WeakReference I0000Il00O;

                @Override
                public final void I00000oIO(Set set) {
/* 7 */             O00IIol o00IIol = (O00IIol) this.I0000Il00O.get();
/* 9 */             if (o00IIol != null) {
/* 61 */                o00IIol.I00000oIO(set);
/* 77 */                return;
                    }
/* 11 */            O00IOI11 o00ioi11 = this.I00000oOI;
/* 13 */            ReentrantLock reentrantLock = o00ioi11.I0000O;
/* 15 */            reentrantLock.lock();
                    try {
/* 24 */                OIOio0O1O oIOio0O1O = (OIOio0O1O) o00ioi11.I0000Il00O.remove(this);
/* 29 */                if (oIOio0O1O != null) {
/* 31 */                    OoIlIoo1oiOo ooIlIoo1oiOo = o00ioi11.I00000oOI;
/* 43 */                    if (((OIOiiiloOio) ooIlIoo1oiOo.I00ioIO).I00000oOI(oIOio0O1O.I00000oOI)) {
/* 52 */                        lO00OiilOI0l.I00000oIO(new O00IIolO0(o00ioi11, null, 1));
                            }
                        }
                    } finally {
/* 57 */                reentrantLock.unlock();
                    }
                }
            }
