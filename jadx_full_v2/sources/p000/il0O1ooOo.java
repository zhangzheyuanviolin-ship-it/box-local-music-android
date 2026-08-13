            package p000;

            import android.os.Parcel;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.Executor;
            
            public final class il0O1ooOo extends i0IiIO {
                public final int I000O01llI0;
                public final iOlloil01Ilo I000OOo1O;
                public final iOIoil I000OiO;
                public final IIiOOI I000iOII;
                public final il1OOI0 I000l1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public il0O1ooOo(il1OOI0 il1ooi0, iOlloil01Ilo iolloil01ilo, iOIoil ioioil, IIiOOI iIiOOI, int i) {
/* 17 */            super("com.google.android.apps.aicore.aidl.IDownloadListener2", 2);
/* 1 */             this.I000O01llI0 = i;
                    switch (i) {
                        case 1:
/* 21 */                    this.I000OOo1O = iolloil01ilo;
/* 23 */                    this.I000OiO = ioioil;
/* 25 */                    this.I000iOII = iIiOOI;
/* 27 */                    this.I000l1 = il1ooi0;
/* 31 */                    super("com.google.android.apps.aicore.aidl.IDownloadListener", 2);
                            break;
                        default:
/* 7 */                     this.I000OOo1O = iolloil01ilo;
/* 9 */                     this.I000OiO = ioioil;
/* 11 */                    this.I000iOII = iIiOOI;
/* 13 */                    this.I000l1 = il1ooi0;
                            break;
                    }
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 8 */             il1OOI0 il1ooi0 = this.I000l1;
/* 10 */            iOlloil01Ilo iolloil01ilo = this.I000OOo1O;
/* 12 */            iOIoil ioioil = this.I000OiO;
/* 14 */            IIiOOI iIiOOI = this.I000iOII;
/* 21 */            int i3 = 3;
                    switch (i2) {
                        case 0:
/* 166 */                   Executor executor = il1ooi0.I00iiO;
/* 168 */                   if (i == 2) {
/* 292 */                       parcel.readString();
/* 295 */                       long j = parcel.readLong();
/* 299 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 304 */                       il00Ool il00ool = new il00Ool(0);
/* 307 */                       il00ool.I00iiI = iolloil01ilo;
/* 309 */                       il00ool.I00iiO = ioioil;
/* 311 */                       il00ool.I00iio = j;
/* 313 */                       VarHandle.storeStoreFence();
/* 316 */                       executor.execute(il00ool);
                                break;
                            } else if (i == 3) {
/* 264 */                       parcel.readString();
/* 267 */                       long j2 = parcel.readLong();
/* 271 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 276 */                       il00Ool il00ool2 = new il00Ool(1);
/* 279 */                       il00ool2.I00iiI = iolloil01ilo;
/* 281 */                       il00ool2.I00iiO = ioioil;
/* 283 */                       il00ool2.I00iio = j2;
/* 285 */                       VarHandle.storeStoreFence();
/* 288 */                       executor.execute(il00ool2);
                                break;
                            } else if (i == 4) {
/* 204 */                       String string = parcel.readString();
/* 208 */                       int i4 = parcel.readInt();
/* 212 */                       String string2 = parcel.readString();
/* 216 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 219 */                       Locale locale = Locale.ENGLISH;
/* 237 */                       iOIIOoOoii ioiiooooiiI00000oOI = iOIIOoOoii.I00000oOI(i4 == 1 ? GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE : 0, IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(i4, "Feature ", string, " failed with failure status ", " and error "), string2, "."), null);
/* 243 */                       iili1oo1o iili1oo1oVar = new iili1oo1o(i3);
/* 246 */                       iili1oo1oVar.I00iiO = iolloil01ilo;
/* 248 */                       iili1oo1oVar.I00iio = ioioil;
/* 250 */                       iili1oo1oVar.I00iiI = i4;
/* 252 */                       iili1oo1oVar.I00ilI0I1 = ioiiooooiiI00000oOI;
/* 254 */                       VarHandle.storeStoreFence();
/* 257 */                       executor.execute(iili1oo1oVar);
/* 260 */                       iIiOOI.I0000O(ioiiooooiiI00000oOI);
                                break;
                            } else if (i == 5) {
/* 179 */                       parcel.readString();
/* 182 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 187 */                       l0iOoII1Il l0iooii1il = new l0iOoII1Il(5);
/* 190 */                       l0iooii1il.I00iiI = iolloil01ilo;
/* 192 */                       l0iooii1il.I00iiO = ioioil;
/* 194 */                       VarHandle.storeStoreFence();
/* 197 */                       executor.execute(l0iooii1il);
/* 200 */                       iIiOOI.I00000oOI(null);
                                break;
                            } else {
                                break;
                            }
                        default:
/* 25 */                    Executor executor2 = il1ooi0.I00iiO;
/* 27 */                    if (i == 2) {
/* 138 */                       parcel.readString();
/* 141 */                       long j3 = parcel.readLong();
/* 145 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 150 */                       il00Ool il00ool3 = new il00Ool(2);
/* 153 */                       il00ool3.I00iiI = iolloil01ilo;
/* 155 */                       il00ool3.I00iiO = ioioil;
/* 157 */                       il00ool3.I00iio = j3;
/* 159 */                       VarHandle.storeStoreFence();
/* 162 */                       executor2.execute(il00ool3);
                                break;
                            } else if (i == 3) {
/* 110 */                       parcel.readString();
/* 113 */                       long j4 = parcel.readLong();
/* 117 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 122 */                       il00Ool il00ool4 = new il00Ool(3);
/* 125 */                       il00ool4.I00iiI = iolloil01ilo;
/* 127 */                       il00ool4.I00iiO = ioioil;
/* 129 */                       il00ool4.I00iio = j4;
/* 131 */                       VarHandle.storeStoreFence();
/* 134 */                       executor2.execute(il00ool4);
                                break;
                            } else if (i == 4) {
/* 64 */                        String string3 = parcel.readString();
/* 68 */                        String string4 = parcel.readString();
/* 72 */                        iil1ii1loOI1.I00000oIO(parcel);
/* 75 */                        Locale locale2 = Locale.ENGLISH;
/* 83 */                        iOIIOoOoii ioiiooooiiI00000oOI2 = iOIIOoOoii.I00000oOI(0, Oi010OO0.I001IO000("Feature ", string3, " failed with failure ", string4, "."), null);
/* 91 */                        O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(9);
/* 94 */                        o10oO1IiI1.I00iiI = iolloil01ilo;
/* 96 */                        o10oO1IiI1.I00iiO = ioioil;
/* 98 */                        o10oO1IiI1.I00iio = ioiiooooiiI00000oOI2;
/* 100 */                       VarHandle.storeStoreFence();
/* 103 */                       executor2.execute(o10oO1IiI1);
/* 106 */                       iIiOOI.I0000O(ioiiooooiiI00000oOI2);
                                break;
                            } else if (i == 5) {
/* 38 */                        parcel.readString();
/* 41 */                        iil1ii1loOI1.I00000oIO(parcel);
/* 47 */                        illioiliioi illioiliioiVar = new illioiliioi(6);
/* 50 */                        illioiliioiVar.I00iiI = iolloil01ilo;
/* 52 */                        illioiliioiVar.I00iiO = ioioil;
/* 54 */                        VarHandle.storeStoreFence();
/* 57 */                        executor2.execute(illioiliioiVar);
/* 60 */                        iIiOOI.I00000oOI(null);
                                break;
                            } else {
                                break;
                            }
                    }
/* 17 */            return true;
                }
            }
