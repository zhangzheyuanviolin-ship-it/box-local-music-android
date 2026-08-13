            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            
            public final class o0O0o1lolI extends o0I0I0Ii implements o01oooOIiII {
                public Exception I00io1l;
                public boolean I00ioIO;

                /* JADX WARN: Multi-variable type inference failed */
                public o0O0o1lolI(String str, o01oooOIiII o01ooooiiii, o0OOOlI o0oooli, boolean z, o0Ol1IO o0ol1io) {
/* 3 */             o0OOOlI o0oooliI00000oIO = o0OOOlI.I00000oIO(o0oooli, o0OIlOoolo.I0001Ioi1lo);
/* 16 */            this.I00iio = "<missing root>:".concat(str);
/* 19 */            o01iIll0IO o01iill0io = (o01iIll0IO) o01ooooiiii;
/* 21 */            this.I00iOIl = o01iill0io;
/* 25 */            this.I00iiI = o01iill0io.I00iiI;
/* 29 */            this.I00iiO = o01iill0io.I00iiO;
/* 35 */            this.I00ilI0I1 = Thread.currentThread();
/* 39 */            lII0I0I01I1l.I00000oOI(o0oooliI00000oIO.I0000Il00O);
/* 42 */            this.I00ilO0 = o0oooliI00000oIO;
/* 48 */            this.I00io1l = o01ooooiiii.zzf();
/* 50 */            this.I00ioIO = z;
                }

                @Override
                public final o0OllIoI I00i0ilIl0i(String str, o0OOOlI o0oooli, o0Ol1IO o0ol1io) {
/* 1 */             AtomicReference atomicReference = o0IOOIili01o.I00000oIO;
/* 4 */             return I00iIO(str, o0oooli, true, o0ol1io);
                }

                @Override
                public final o0O0o1lolI I00iIO(String str, o0OOOlI o0oooli, boolean z, o0Ol1IO o0ol1io) {
/* 1 */             boolean z2 = this.I00ioIO;
/* 3 */             if (z && !z2) {
/* 7 */                 AtomicReference atomicReference = o0IOOIili01o.I00000oIO;
                    }
/* 11 */            boolean z3 = true;
/* 12 */            if ((!z || z2) && !z2) {
/* 26 */                z3 = false;
                    }
/* 28 */            return new o0O0o1lolI(str, this, o0oooli, z3, o0ol1io);
                }

                @Override
                public final Exception zzf() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final o0OOOlI zzl() {
/* 1 */             return o0OIlOoolo.I0000oI00;
                }
            }
