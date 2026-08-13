            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.ref.SoftReference;
            
            public abstract class lIlo0Oi0oOI {
                public static OOoOiOo01lo I00000oIO(IIiO00o1o iIiO00o1o, IllOOo00lI illOOo00lI) {
/* 2 */             if (illOOo00lI == null) {
/* 32 */                I000II.I000iOII("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
/* 1 */                 return null;
                    }
/* 6 */             OOoOiOo01lo oOoOiOo01lo = new OOoOiOo01lo();
/* 9 */             oOoOiOo01lo.I00iiI = null;
/* 11 */            oOoOiOo01lo.I00iOIl = illOOo00lI;
/* 13 */            if (iIiO00o1o == null) {
/* 26 */                VarHandle.storeStoreFence();
/* 29 */                return oOoOiOo01lo;
                    }
/* 20 */            oOoOiOo01lo.I00iiI = new SoftReference(iIiO00o1o);
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            return oOoOiOo01lo;
                }
            }
