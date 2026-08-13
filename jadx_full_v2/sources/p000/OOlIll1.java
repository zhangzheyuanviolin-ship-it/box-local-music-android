            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.AccessControlException;
            import java.util.HashMap;
            
            public final class OOlIll1 implements O0iI1olO0O {
                public static final boolean I00l0I0l0lO1;
                public static final HashMap I00l0OO0IO;
                public int[] I00iOIl;
                public String I00iiI;
                public int I00iiO;
                public String[] I00iio;
                public String[] I00ilI0I1;
                public String[] I00ilO0;
                public O0i1lIiil I00io1l;
                public String[] I00ioIO;

                static {
                    try {
/* 13 */                I00l0I0l0lO1 = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
                    } catch (AccessControlException unused) {
/* 17 */                I00l0I0l0lO1 = false;
                    }
/* 21 */            HashMap map = new HashMap();
/* 24 */            I00l0OO0IO = map;
/* 30 */            Ill0IO ill0IO = new Ill0IO("kotlin.jvm.internal.KotlinClass");
/* 50 */            map.put(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()), O0i1lIiil.I00ilI0I1);
/* 57 */            Ill0IO ill0IO2 = new Ill0IO("kotlin.jvm.internal.KotlinFileFacade");
/* 77 */            map.put(new IOIOill(ill0IO2.I00000oOI(), ill0IO2.I00000oIO.I000II()), O0i1lIiil.I00ilO0);
/* 84 */            Ill0IO ill0IO3 = new Ill0IO("kotlin.jvm.internal.KotlinMultifileClass");
/* 104 */           map.put(new IOIOill(ill0IO3.I00000oOI(), ill0IO3.I00000oIO.I000II()), O0i1lIiil.I00ioIO);
/* 111 */           Ill0IO ill0IO4 = new Ill0IO("kotlin.jvm.internal.KotlinMultifileClassPart");
/* 131 */           map.put(new IOIOill(ill0IO4.I00000oOI(), ill0IO4.I00000oIO.I000II()), O0i1lIiil.I00l0I0l0lO1);
/* 138 */           Ill0IO ill0IO5 = new Ill0IO("kotlin.jvm.internal.KotlinSyntheticClass");
/* 158 */           map.put(new IOIOill(ill0IO5.I00000oOI(), ill0IO5.I00000oIO.I000II()), O0i1lIiil.I00io1l);
                }

                @Override
                public final O0iI0IlO0iI I0000oI00(IOIOill iOIOill, OOo1Il01OliO oOo1Il01OliO) {
                    O0i1lIiil o0i1lIiil;
/* 1 */             Ill0IO ill0IOI00000oIO = iOIOill.I00000oIO();
/* 11 */            if (ill0IOI00000oIO.equals(O0I01I.I00000oIO)) {
/* 17 */                IIOOoll iIOOoll = new IIOOoll(21);
/* 20 */                iIOOoll.I00iiI = this;
/* 22 */                VarHandle.storeStoreFence();
/* 25 */                return iIOOoll;
                    }
/* 32 */            if (ill0IOI00000oIO.equals(O0I01I.I000oI1ioi)) {
/* 38 */                O1OIll00i o1OIll00i = new O1OIll00i(20);
/* 41 */                o1OIll00i.I00iiI = this;
/* 43 */                VarHandle.storeStoreFence();
/* 46 */                return o1OIll00i;
                    }
/* 49 */            if (I00l0I0l0lO1 || this.I00io1l != null || (o0i1lIiil = (O0i1lIiil) I00l0OO0IO.get(iOIOill)) == null) {
/* 82 */                return null;
                    }
/* 67 */            this.I00io1l = o0i1lIiil;
/* 73 */            IIloOI iIloOI = new IIloOI(22);
/* 76 */            iIloOI.I00iiI = this;
/* 78 */            VarHandle.storeStoreFence();
/* 81 */            return iIloOI;
                }
            }
