            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.io.Serializable;
            import java.lang.reflect.Array;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class O0O11IOl1Io extends OlliIl0 {
                public final int I0001Ioi1lo;
                public Serializable I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0O11IOl1Io(OoIllIioi1l ooIllIioi1l, int i) {
/* 3 */             super(ooIllIioi1l);
/* 1 */             this.I0001Ioi1lo = i;
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, o0llIi[]] */
                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws IOException {
                    switch (this.I0001Ioi1lo) {
                        case 0:
/* 56 */                    int iI00OIl = ioiOloi.I00OIl();
/* 60 */                    if (iI00OIl != 0) {
/* 68 */                        iI00OIl = (iI00OIl << 16) | ioiOloi.I00OIl();
                            }
/* 84 */                    int iI00OIl2 = iI00OIl == 0 ? ioiOloi.I00OIl() : iI00OIl == 1 ? (int) ioiOloi.I00IoiI() : 0;
/* 85 */                    if (iI00OIl2 > 0) {
/* 89 */                        this.I000II = new o0llIi[iI00OIl2];
/* 92 */                        for (int i = 0; i < iI00OIl2; i++) {
/* 98 */                            o0llIi o0llii = new o0llIi(12);
/* 103 */                           if (iI00OIl == 0) {
/* 105 */                               int iI00OIl3 = ioiOloi.I00OIl();
/* 109 */                               if (iI00OIl3 == 0) {
/* 129 */                                   int iI00OIl4 = ioiOloi.I00OIl();
/* 134 */                                   if (iI00OIl4 < 6) {
/* 219 */                                       IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("Kerning sub-table too short, got ", iI00OIl4, " bytes, expect 6 or more."));
                                                break;
                                            } else {
/* 144 */                                       int iI00OIl5 = (ioiOloi.I00OIl() & 65280) >> 8;
/* 147 */                                       if (iI00OIl5 == 0) {
/* 149 */                                           int iI00OIl6 = ioiOloi.I00OIl();
/* 153 */                                           ioiOloi.I00OIl();
/* 156 */                                           ioiOloi.I00OIl();
/* 159 */                                           ioiOloi.I00OIl();
/* 175 */                                           int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iI00OIl6, 3);
/* 178 */                                           for (int i2 = 0; i2 < iI00OIl6; i2++) {
/* 180 */                                               int iI00OIl7 = ioiOloi.I00OIl();
/* 184 */                                               int iI00OIl8 = ioiOloi.I00OIl();
/* 188 */                                               short sI00IioO0OiOi = ioiOloi.I00IioO0OiOi();
/* 192 */                                               int[] iArr2 = iArr[i2];
/* 194 */                                               iArr2[0] = iI00OIl7;
/* 196 */                                               iArr2[1] = iI00OIl8;
/* 198 */                                               iArr2[2] = sI00IioO0OiOi;
                                                    }
                                                } else if (iI00OIl5 == 2) {
/* 207 */                                           Log.i("PdfBox-Android", "Kerning subtable format 2 not yet supported.");
                                                }
                                            }
                                        } else {
/* 125 */                                   Log.i("PdfBox-Android", "Unsupported kerning sub-table version: " + iI00OIl3);
                                        }
                                    } else if (iI00OIl != 1) {
/* 240 */                               IOOlIIilOl0.I000iOII();
                                        break;
                                    } else {
/* 227 */                               Log.i("PdfBox-Android", "Kerning subtable format 1 not yet supported.");
                                    }
/* 234 */                           ((o0llIi[]) this.I000II)[i] = o0llii;
                                }
                            }
/* 244 */                   this.I0000O = true;
                            break;
                        default:
/* 8 */                     ioiOloi.I001i1lo1io();
/* 11 */                    ioiOloi.I00IioO0OiOi();
/* 14 */                    int iI00OIl9 = ioiOloi.I00OIl();
/* 23 */                    this.I000II = new ConcurrentHashMap(iI00OIl9);
/* 25 */                    for (int i3 = 0; i3 < iI00OIl9; i3++) {
/* 47 */                        ((ConcurrentHashMap) this.I000II).put(Integer.valueOf(ioiOloi.I00OIl()), Integer.valueOf(ioiOloi.I00IioO0OiOi()));
                            }
/* 53 */                    this.I0000O = true;
                            break;
                    }
                }
            }
