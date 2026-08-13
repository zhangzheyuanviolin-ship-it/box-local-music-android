            package p000;

            import java.util.List;
            
            public abstract class iOIo0I10oO11 {
                public static final void I00000oIO(List list, List list2) {
/* 1 */             if (list2 == null) {
/* 8 */                 if (list.size() >= 2) {
/* 27 */                    return;
                        }
/* 13 */                I000II.I000iOII("colors must have length of at least 2 if colorStops is omitted.");
                    } else {
/* 25 */                if (list.size() == list2.size()) {
/* 27 */                    return;
                        }
/* 30 */                I000II.I000iOII("colors and colorStops arguments must have equal length.");
                    }
                }
            }
