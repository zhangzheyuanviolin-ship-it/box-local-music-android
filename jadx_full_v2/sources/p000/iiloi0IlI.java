            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import java.io.IOException;
            
            public final class iiloi0IlI extends liiiIlII00 {
                public static final Parcelable.Creator<iiloi0IlI> CREATOR = new iiiilIIoIi(9);
                public static final lOl10OOloi I00olI;
                public lOI1lll1l10 I00iOIl;
                public float I00iiI;
                public int I00iiO;
                public lOI1lll1l10 I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public ii1loioI I00io1l;
                public boolean I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public float I00lli11;
                public String I00lll10;
                public Bundle I00o0iI0io1;
                public int I00o0l1o1o0;
                public il0llOOOOIO I00o101lO;
                public int I00oI0i;
                public iilIIi1 I00oII;
                public iiooOolI1 I00oIiI10;
                public boolean I00oO101o;
                public il1o1o0111Oi I00oOio10iI1;
                public ii0ilo1o1I I00ol1;

                static {
/* 10 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 18 */            Object[] objArr = {"auxiliary_lora_file", "auxiliary_drafter_lora_file", "auxiliary_session_state_file"};
/* 23 */            ll0lIii.I00000oIO(3, objArr);
/* 30 */            I00olI = lOI1lll1l10.I000oI1ioi(3, objArr);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, loi1lll1l10);
/* 13 */            float f = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeFloat(f);
/* 23 */            int i2 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(i2);
/* 34 */            lO0IioIooIl.I000l1(parcel, 4, this.I00iio);
/* 37 */            int i3 = this.I00ilI0I1;
/* 40 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 43 */            parcel.writeInt(i3);
/* 46 */            int i4 = this.I00ilO0;
/* 49 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 52 */            parcel.writeInt(i4);
/* 55 */            ii1loioI ii1loioi = this.I00io1l;
/* 67 */            lO0IioIooIl.I0001Ioi1lo(parcel, 7, ii1loioi == null ? null : ii1loioi.asBinder());
/* 70 */            boolean z = this.I00ioIO;
/* 74 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 77 */            parcel.writeInt(z ? 1 : 0);
/* 80 */            int i5 = this.I00l0I0l0lO1;
/* 84 */            lO0IioIooIl.I000oI1ioi(parcel, 9, 4);
/* 87 */            parcel.writeInt(i5);
/* 90 */            ii0ilo1o1I ii0ilo1o1i = this.I00ol1;
/* 99 */            lO0IioIooIl.I0001Ioi1lo(parcel, 10, ii0ilo1o1i != null ? ii0ilo1o1i.I000O01llI0 : null);
/* 102 */           int i6 = this.I00l0OO0IO;
/* 106 */           lO0IioIooIl.I000oI1ioi(parcel, 11, 4);
/* 109 */           parcel.writeInt(i6);
/* 112 */           int i7 = this.I00li1OI;
/* 116 */           lO0IioIooIl.I000oI1ioi(parcel, 12, 4);
/* 119 */           parcel.writeInt(i7);
/* 126 */           lO0IioIooIl.I000OiO(parcel, 13, this.I00lll10);
/* 133 */           lO0IioIooIl.I00000oIO(parcel, 14, this.I00o0iI0io1);
/* 136 */           int i8 = this.I00o0l1o1o0;
/* 140 */           lO0IioIooIl.I000oI1ioi(parcel, 15, 4);
/* 143 */           parcel.writeInt(i8);
/* 150 */           lO0IioIooIl.I000OOo1O(parcel, 16, this.I00o101lO, i);
/* 153 */           int i9 = this.I00oI0i;
/* 157 */           lO0IioIooIl.I000oI1ioi(parcel, 17, 4);
/* 160 */           parcel.writeInt(i9);
/* 167 */           lO0IioIooIl.I000OOo1O(parcel, 18, this.I00oII, i);
/* 170 */           int i10 = this.I00ll1;
/* 174 */           lO0IioIooIl.I000oI1ioi(parcel, 19, 4);
/* 177 */           parcel.writeInt(i10);
/* 180 */           float f2 = this.I00lli11;
/* 184 */           lO0IioIooIl.I000oI1ioi(parcel, 20, 4);
/* 187 */           parcel.writeFloat(f2);
/* 194 */           lO0IioIooIl.I000OOo1O(parcel, 21, this.I00oIiI10, i);
/* 197 */           boolean z2 = this.I00oO101o;
/* 201 */           lO0IioIooIl.I000oI1ioi(parcel, 22, 4);
/* 204 */           parcel.writeInt(z2 ? 1 : 0);
/* 211 */           lO0IioIooIl.I000OOo1O(parcel, 23, this.I00oOio10iI1, i);
/* 214 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

                public final void zzb() throws IOException {
                    ParcelFileDescriptor parcelFileDescriptor;
                    ParcelFileDescriptor parcelFileDescriptor2;
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iOIl;
/* 3 */             int size = loi1lll1l10.size();
/* 9 */             for (int i = 0; i < size; i++) {
/* 15 */                iiio1OOIi iiio1ooii = (iiio1OOIi) loi1lll1l10.get(i);
/* 17 */                ParcelFileDescriptor parcelFileDescriptor3 = iiio1ooii.I00ilI0I1;
/* 19 */                if (parcelFileDescriptor3 != null) {
/* 21 */                    parcelFileDescriptor3.close();
                        }
/* 24 */                iiOoiOI1Oo iiooioi1oo = iiio1ooii.I00io1l;
/* 26 */                if (iiooioi1oo != null && (parcelFileDescriptor2 = iiooioi1oo.I00iOIl) != null) {
/* 32 */                    parcelFileDescriptor2.close();
                        }
                    }
/* 38 */            Bundle bundle = this.I00o0iI0io1;
/* 40 */            if (bundle != null) {
/* 42 */                lOl10OOloi lol10ooloi = I00olI;
/* 44 */                int i2 = lol10ooloi.I00iio;
/* 46 */                for (int i3 = 0; i3 < i2; i3++) {
/* 60 */                    ParcelFileDescriptor parcelFileDescriptor4 = (ParcelFileDescriptor) bundle.getParcelable((String) lol10ooloi.get(i3), ParcelFileDescriptor.class);
/* 62 */                    if (parcelFileDescriptor4 != null) {
/* 64 */                        parcelFileDescriptor4.close();
                            }
                        }
                    }
/* 70 */            iilIIi1 iiliii1 = this.I00oII;
/* 72 */            if (iiliii1 == null || (parcelFileDescriptor = iiliii1.I00iiI) == null) {
/* 110 */               return;
                    }
/* 78 */            parcelFileDescriptor.close();
                }
            }
