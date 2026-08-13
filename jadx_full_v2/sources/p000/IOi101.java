            package p000;

            import android.util.Size;
            import java.util.Comparator;
            
            public final class IOi101 implements Comparator {
                public final boolean I00iOIl;

                public IOi101(boolean z) {
/* 4 */             this.I00iOIl = z;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
/* 1 */             Size size = (Size) obj;
/* 3 */             Size size2 = (Size) obj2;
/* 28 */            int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                    return this.I00iOIl ? iSignum * (-1) : iSignum;
                }
            }
