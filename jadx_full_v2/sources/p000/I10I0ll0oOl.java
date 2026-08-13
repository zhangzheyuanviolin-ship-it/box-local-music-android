            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import java.util.List;
            
            public final class I10I0ll0oOl extends IO0i1l1Io {
                public final int I00iiI;
                public final ViewGroup I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10I0ll0oOl(ViewGroup viewGroup, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = viewGroup;
                }

                @Override
                public final i00iooo00li I0000O(i00iooo00li i00iooo00liVar, List list) {
/* 1 */             int i = this.I00iiI;
/* 3 */             ViewGroup viewGroup = this.I00iiO;
                    switch (i) {
                        case 0:
/* 80 */                    return ((Oooio0iiI0) viewGroup).I000iOII(i00iooo00liVar);
                        default:
/* 8 */                     Iii0OO1IIiO iii0OO1IIiO = (Iii0OO1IIiO) viewGroup;
/* 12 */                    if (iii0OO1IIiO.I00lli11) {
/* 77 */                        return i00iooo00liVar;
                            }
/* 16 */                    View childAt = iii0OO1IIiO.getChildAt(0);
/* 24 */                    int iMax = Math.max(0, childAt.getLeft());
/* 32 */                    int iMax2 = Math.max(0, childAt.getTop());
/* 45 */                    int iMax3 = Math.max(0, iii0OO1IIiO.getWidth() - childAt.getRight());
/* 58 */                    int iMax4 = Math.max(0, iii0OO1IIiO.getHeight() - childAt.getBottom());
                            return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? i00iooo00liVar : i00iooo00liVar.I00000oIO.I0010I0i(iMax, iMax2, iMax3, iMax4);
                    }
                }

                @Override
                public final OoIOol I0000oI00(i00O10oO1ll i00o10oo1ll, OoIOol ooIOol) {
/* 1 */             int i = this.I00iiI;
/* 4 */             ViewGroup viewGroup = this.I00iiO;
                    switch (i) {
                        case 0:
/* 115 */                   Iollol0oI iollol0oI = (Iollol0oI) ((Oooio0iiI0) viewGroup).I00oliIiO01i.I010101Oo1lO.I00iio;
/* 121 */                   if (!iollol0oI.I011iIOio.I00lll10) {
/* 244 */                       return ooIOol;
                            }
/* 131 */                   long jI00000oOI = ioolillioIIO.I00000oOI(iollol0oI.I00Iooi00oi(0L));
/* 139 */                   int i2 = (int) (jI00000oOI >> 32);
/* 140 */                   if (i2 < 0) {
/* 142 */                       i2 = 0;
                            }
/* 149 */                   int i3 = (int) (jI00000oOI & 4294967295L);
/* 150 */                   if (i3 < 0) {
/* 152 */                       i3 = 0;
                            }
/* 157 */                   long jI000iOII = l0o0IlOil1.I0000Il00O(iollol0oI).I000iOII();
/* 163 */                   int i4 = (int) (jI000iOII >> 32);
/* 165 */                   int i5 = (int) (jI000iOII & 4294967295L);
/* 166 */                   long j = iollol0oI.I00iiO;
/* 194 */                   long jI00000oOI2 = ioolillioIIO.I00000oOI(iollol0oI.I00Iooi00oi((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
/* 201 */                   int i6 = i4 - ((int) (jI00000oOI2 >> 32));
/* 202 */                   if (i6 < 0) {
/* 204 */                       i6 = 0;
                            }
/* 208 */                   int i7 = i5 - ((int) (jI00000oOI2 & 4294967295L));
/* 209 */                   int i8 = i7 >= 0 ? i7 : 0;
                            return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? ooIOol : new OoIOol(2, I10I1li0.I000OiO((Ioo0l0I) ooIOol.I00iiI, i2, i3, i6, i8), I10I1li0.I000OiO((Ioo0l0I) ooIOol.I00iiO, i2, i3, i6, i8));
                        default:
/* 10 */                    Iii0OO1IIiO iii0OO1IIiO = (Iii0OO1IIiO) viewGroup;
/* 14 */                    if (iii0OO1IIiO.I00lli11) {
/* 106 */                       return ooIOol;
                            }
/* 17 */                    View childAt = iii0OO1IIiO.getChildAt(0);
/* 25 */                    int iMax = Math.max(0, childAt.getLeft());
/* 33 */                    int iMax2 = Math.max(0, childAt.getTop());
/* 46 */                    int iMax3 = Math.max(0, iii0OO1IIiO.getWidth() - childAt.getRight());
/* 59 */                    int iMax4 = Math.max(0, iii0OO1IIiO.getHeight() - childAt.getBottom());
/* 63 */                    if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
/* 106 */                       return ooIOol;
                            }
/* 72 */                    Ioo0l0I ioo0l0II00000oIO = Ioo0l0I.I00000oIO(iMax, iMax2, iMax3, iMax4);
/* 76 */                    int i9 = ioo0l0II00000oIO.I00000oIO;
/* 82 */                    Ioo0l0I ioo0l0I = (Ioo0l0I) ooIOol.I00iiI;
/* 84 */                    int i10 = ioo0l0II00000oIO.I00000oOI;
/* 86 */                    int i11 = ioo0l0II00000oIO.I0000Il00O;
/* 88 */                    int i12 = ioo0l0II00000oIO.I0000O;
/* 102 */                   return new OoIOol(2, i00iooo00li.I00000oIO(ioo0l0I, i9, i10, i11, i12), i00iooo00li.I00000oIO((Ioo0l0I) ooIOol.I00iiO, i9, i10, i11, i12));
                    }
                }
            }
