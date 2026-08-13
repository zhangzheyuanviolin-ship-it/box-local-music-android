            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O0lolo extends l0olooIII0o {
                public I00Ol00 I00000oIO;

                public static void I0000O(O0lolo o0lolo, String str, IOii1l iOii1l, int i) {
/* 3 */             O0l0IlolloIO o0l0IlolloIO = null;
/* 4 */             if ((i & 1) != 0) {
/* 6 */                 str = null;
                    }
/* 7 */             I00Ol00 i00Ol00 = o0lolo.I00000oIO;
/* 11 */            if (str != null) {
/* 16 */                o0l0IlolloIO = new O0l0IlolloIO(4);
/* 19 */                o0l0IlolloIO.I00iiI = str;
/* 21 */                VarHandle.storeStoreFence();
                    }
/* 28 */            IoI0IiI0 ioI0IiI0 = new IoI0IiI0(28);
/* 31 */            VarHandle.storeStoreFence();
/* 37 */            I0oioiIIlo i0oioiIIlo = new I0oioiIIlo(2);
/* 40 */            i0oioiIIlo.I00iiI = iOii1l;
/* 42 */            VarHandle.storeStoreFence();
/* 56 */            i00Ol00.I00000oIO(1, new O0lol1(o0l0IlolloIO, ioI0IiI0, new IOii1l(-857469575, i0oioiIIlo, true)));
                }

                @Override
                public final I00Ol00 I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                public final void I0000oI00(int i, Function1 function1, Function1 function12, IOii1l iOii1l) {
/* 8 */             this.I00000oIO.I00000oIO(i, new O0lol1(function1, function12, iOii1l));
                }
            }
