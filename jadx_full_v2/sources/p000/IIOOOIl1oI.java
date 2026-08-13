            package p000;

            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class IIOOOIl1oI implements IliIo0lOI {
                public String I00iOIl;
                public final LinkedHashMap I00iiI = new LinkedHashMap();
                public IIOO0I I00iiO;
                public byte[][] I00iio;
                public byte[][] I00ilI0I1;

                @Override
                public final II1i0i0ilO I0000Il00O() {
/* 13 */            return new II1i0i0ilO((List) this.I00iiI.get("FontBBox"));
                }

                public final void I0000O(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 5 */                 this.I00iiI.put(str, obj);
                    }
                }

                @Override
                public final String getName() {
/* 1 */             return this.I00iOIl;
                }

                public final String toString() {
/* 63 */            return getClass().getSimpleName() + "[name=" + this.I00iOIl + ", topDict=" + this.I00iiI + ", charset=" + this.I00iiO + ", charStrings=" + Arrays.deepToString(this.I00iio) + "]";
                }
            }
