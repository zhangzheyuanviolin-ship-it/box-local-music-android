            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            public final class i0IIIlO01011 extends i0Oi011IO0 {
                public final int I00iiI;
                public final int I00iiO;
                public final String I00iio;
                public final String I00ilI0I1;
                public final int I00ilO0;
                public final OloIlI0ll I00io1l;
                public final i0Ii1l I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IIIlO01011(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, int i, String str, String str2, int i2, OloIlI0ll oloIlI0ll2, int i3) {
/* 15 */            super(oloIlI0ll);
/* 1 */             this.I00iiI = i3;
/* 3 */             this.I00iiO = i;
/* 5 */             this.I00iio = str;
/* 7 */             this.I00ilI0I1 = str2;
/* 9 */             this.I00ilO0 = i2;
/* 11 */            this.I00io1l = oloIlI0ll2;
/* 13 */            this.I00ioIO = i0ii1l;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             int i = this.I00iiI;
/* 12 */            i0Ii1l i0ii1l = this.I00ioIO;
/* 14 */            int i2 = this.I00iiO;
/* 16 */            String str = this.I00iio;
/* 18 */            String str2 = this.I00ilI0I1;
/* 20 */            int i3 = this.I00ilO0;
/* 22 */            OloIlI0ll oloIlI0ll = this.I00io1l;
                    switch (i) {
                        case 0:
                            try {
/* 123 */                       i0OIIoi i0oiioi = i0ii1l.I0000O.I000lI;
/* 125 */                       String str3 = i0ii1l.I00000oIO;
/* 129 */                       Bundle bundle = new Bundle();
/* 132 */                       bundle.putInt("session_id", i2);
/* 135 */                       bundle.putString("module_name", str);
/* 138 */                       bundle.putString("slice_id", str2);
/* 141 */                       bundle.putInt("chunk_number", i3);
/* 144 */                       Bundle bundleI000O01llI0 = i0Ii1l.I000O01llI0();
/* 151 */                       i0IO1Ollol i0io1ollol = new i0IO1Ollol(i0ii1l, oloIlI0ll, 2);
/* 154 */                       i0O0llIi0O01 i0o0llii0o01 = (i0O0llIi0O01) i0oiioi;
/* 156 */                       Parcel parcelI00000oOI = i0o0llii0o01.I00000oOI();
/* 160 */                       parcelI00000oOI.writeString(str3);
/* 163 */                       int i4 = i0IoOOOoOIoI.I00000oIO;
/* 165 */                       parcelI00000oOI.writeInt(1);
/* 168 */                       bundle.writeToParcel(parcelI00000oOI, 0);
/* 171 */                       parcelI00000oOI.writeInt(1);
/* 174 */                       bundleI000O01llI0.writeToParcel(parcelI00000oOI, 0);
/* 177 */                       parcelI00000oOI.writeStrongBinder(i0io1ollol);
/* 181 */                       i0o0llii0o01.I0000O(6, parcelI00000oOI);
                                break;
                            } catch (RemoteException e) {
/* 192 */                       i0Ii1l.I000II.I0000Il00O(e, "notifyChunkTransferred", new Object[0]);
                            }
                        default:
                            try {
/* 30 */                        i0OIIoi i0oiioi2 = i0ii1l.I0000O.I000lI;
/* 32 */                        String str4 = i0ii1l.I00000oIO;
/* 36 */                        Bundle bundle2 = new Bundle();
/* 39 */                        bundle2.putInt("session_id", i2);
/* 42 */                        bundle2.putString("module_name", str);
/* 45 */                        bundle2.putString("slice_id", str2);
/* 48 */                        bundle2.putInt("chunk_number", i3);
/* 51 */                        Bundle bundleI000O01llI02 = i0Ii1l.I000O01llI0();
/* 57 */                        i0IO1Ollol i0io1ollol2 = new i0IO1Ollol(i0ii1l, oloIlI0ll, 1);
/* 60 */                        i0O0llIi0O01 i0o0llii0o012 = (i0O0llIi0O01) i0oiioi2;
/* 62 */                        Parcel parcelI00000oOI2 = i0o0llii0o012.I00000oOI();
/* 66 */                        parcelI00000oOI2.writeString(str4);
/* 69 */                        int i5 = i0IoOOOoOIoI.I00000oIO;
/* 71 */                        parcelI00000oOI2.writeInt(1);
/* 74 */                        bundle2.writeToParcel(parcelI00000oOI2, 0);
/* 77 */                        parcelI00000oOI2.writeInt(1);
/* 80 */                        bundleI000O01llI02.writeToParcel(parcelI00000oOI2, 0);
/* 83 */                        parcelI00000oOI2.writeStrongBinder(i0io1ollol2);
/* 88 */                        i0o0llii0o012.I0000O(11, parcelI00000oOI2);
                                break;
                            } catch (RemoteException e2) {
/* 109 */                       i0Ii1l.I000II.I00000oOI("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
/* 117 */                       oloIlI0ll.I0000Il00O(new RuntimeException(e2));
/* 120 */                       return;
                            }
                    }
                }
            }
