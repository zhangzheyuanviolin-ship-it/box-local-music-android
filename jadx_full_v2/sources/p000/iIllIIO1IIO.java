            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iIllIIO1IIO {
                /* JADX WARN: Multi-variable type inference failed */
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo) {
                    O1ooIo101ll o1ooIo101ll;
/* 1 */             if (z) {
/* 5 */                 IliIlIIO10I iliIlIIO10I = new IliIlIIO10I();
/* 8 */                 iliIlIIO10I.I00000oIO = oI0lOIiOIOOo;
/* 10 */                VarHandle.storeStoreFence();
                        o1ooIo101ll = iliIlIIO10I;
                    } else {
/* 14 */                o1ooIo101ll = O1ooIo101ll.I00000oIO;
                    }
/* 16 */            return o1ooiI111i.I0000O(o1ooIo101ll);
                }
            }
