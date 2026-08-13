            package p000;

            import android.net.NetworkRequest;
            import android.util.Log;
            
            public abstract class l1il0l0IoOO1 {
                public static final NetworkRequest I00000oIO(int[] iArr, int[] iArr2) {
/* 3 */             NetworkRequest.Builder builder = new NetworkRequest.Builder();
/* 12 */            for (int i : iArr) {
                        try {
/* 16 */                    builder.addCapability(i);
                        } catch (IllegalArgumentException e) {
/* 21 */                    IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 25 */                    String str = OIIOOo.I00000oOI;
/* 27 */                    String str2 = OIIOOo.I00000oOI;
/* 31 */                    String strI0010I0i = Oi010OO0.I0010I0i("Ignoring adding capability '", i, '\'');
/* 37 */                    if (iIi0oIlI000II.I00iOIl <= 5) {
/* 39 */                        Log.w(str2, strI0010I0i, e);
                            }
                        }
                    }
/* 47 */            for (int i2 = 0; i2 < 3; i2++) {
/* 51 */                int i3 = iO00l1ollO.I00000oIO[i2];
/* 57 */                if (!I1IoiO1l.I0000oI00(iArr, i3)) {
                            try {
/* 59 */                        builder.removeCapability(i3);
                            } catch (IllegalArgumentException e2) {
/* 64 */                        IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 68 */                        String str3 = OIIOOo.I00000oOI;
/* 70 */                        String str4 = OIIOOo.I00000oOI;
/* 74 */                        String strI0010I0i2 = Oi010OO0.I0010I0i("Ignoring removing default capability '", i3, '\'');
/* 80 */                        if (iIi0oIlI000II2.I00iOIl <= 5) {
/* 82 */                            Log.w(str4, strI0010I0i2, e2);
                                }
                            }
                        }
                    }
/* 89 */            for (int i4 : iArr2) {
/* 93 */                builder.addTransportType(i4);
                    }
/* 99 */            return builder.build();
                }
            }
