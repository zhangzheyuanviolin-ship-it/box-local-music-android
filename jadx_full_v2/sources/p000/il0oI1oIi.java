            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class il0oI1oIi {
                public static final IiIooii I00000oIO(float f, float f2) {
/* 3 */             IiIooii iiIooii = new IiIooii();
/* 6 */             iiIooii.I00iOIl = f;
/* 8 */             iiIooii.I00iiI = f2;
/* 10 */            VarHandle.storeStoreFence();
/* 37 */            return iiIooii;
                }
            }
