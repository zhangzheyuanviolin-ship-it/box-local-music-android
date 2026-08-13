            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class Oi11ioo implements IOI01O1 {
                public final Function1 I00000oIO;
                public final String I00000oOI;

                public Oi11ioo(String str, Function1 function1) {
/* 4 */             this.I00000oIO = function1;
/* 12 */            this.I00000oOI = "must return ".concat(str);
                }

                @Override
                public final boolean I00000oIO(O00loo1i111O o00loo1i111O) {
/* 13 */            return O0000Ioio00.I0000O(o00loo1i111O.I00io1l, this.I00000oIO.invoke(IiOiOOIo.I0000oI00(o00loo1i111O)));
                }

                @Override
                public final String I00000oOI(O00loo1i111O o00loo1i111O) {
/* 1 */             return iOlIoli00010.I00000oIO(this, o00loo1i111O);
                }

                @Override
                public final String getDescription() {
/* 1 */             return this.I00000oOI;
                }
            }
