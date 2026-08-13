            package p000;

            import android.os.Parcel;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.Executor;
            
            public final class iio1IIoOO extends i0IiIO {
                public final int I000O01llI0;
                public final ii01iI1oI1l I000OOo1O;
                public final iOli1OIoI0o I000OiO;
                public final IIiOOI I000iOII;
                public final il00iIOo1 I000l1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iio1IIoOO(il00iIOo1 il00iioo1, ii01iI1oI1l ii01ii1oi1l, iOli1OIoI0o ioli1oioi0o, IIiOOI iIiOOI, int i) {
/* 17 */            super("com.google.android.apps.aicore.aidl.IDownloadListener2", 5);
/* 1 */             this.I000O01llI0 = i;
                    switch (i) {
                        case 1:
/* 21 */                    this.I000OOo1O = ii01ii1oi1l;
/* 23 */                    this.I000OiO = ioli1oioi0o;
/* 25 */                    this.I000iOII = iIiOOI;
/* 27 */                    this.I000l1 = il00iioo1;
/* 31 */                    super("com.google.android.apps.aicore.aidl.IDownloadListener", 5);
                            break;
                        default:
/* 7 */                     this.I000OOo1O = ii01ii1oi1l;
/* 9 */                     this.I000OiO = ioli1oioi0o;
/* 11 */                    this.I000iOII = iIiOOI;
/* 13 */                    this.I000l1 = il00iioo1;
                            break;
                    }
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 8 */             il00iIOo1 il00iioo1 = this.I000l1;
/* 10 */            ii01iI1oI1l ii01ii1oi1l = this.I000OOo1O;
/* 12 */            iOli1OIoI0o ioli1oioi0o = this.I000OiO;
/* 14 */            IIiOOI iIiOOI = this.I000iOII;
/* 21 */            int i3 = 0;
                    switch (i2) {
                        case 0:
/* 164 */                   Executor executor = il00iioo1.I00iiO;
/* 166 */                   if (i == 2) {
/* 293 */                       parcel.readString();
/* 296 */                       long j = parcel.readLong();
/* 300 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 305 */                       iilll11ii10I iilll11ii10i = new iilll11ii10I(0);
/* 308 */                       iilll11ii10i.I00iiI = ii01ii1oi1l;
/* 310 */                       iilll11ii10i.I00iiO = ioli1oioi0o;
/* 312 */                       iilll11ii10i.I00iio = j;
/* 314 */                       VarHandle.storeStoreFence();
/* 317 */                       executor.execute(iilll11ii10i);
                                break;
                            } else if (i == 3) {
/* 265 */                       parcel.readString();
/* 268 */                       long j2 = parcel.readLong();
/* 272 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 277 */                       iilll11ii10I iilll11ii10i2 = new iilll11ii10I(1);
/* 280 */                       iilll11ii10i2.I00iiI = ii01ii1oi1l;
/* 282 */                       iilll11ii10i2.I00iiO = ioli1oioi0o;
/* 284 */                       iilll11ii10i2.I00iio = j2;
/* 286 */                       VarHandle.storeStoreFence();
/* 289 */                       executor.execute(iilll11ii10i2);
                                break;
                            } else if (i == 4) {
/* 203 */                       String string = parcel.readString();
/* 207 */                       int i4 = parcel.readInt();
/* 211 */                       String string2 = parcel.readString();
/* 215 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 218 */                       Locale locale = Locale.ENGLISH;
/* 238 */                       iOlI0O0iIiO ioli0o0iiioI00000oOI = iOlI0O0iIiO.I00000oOI(i4 == 1 ? GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE : 0, IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(i4, "Feature ", string, " failed with failure status ", " and error "), string2, "."), null);
/* 244 */                       iili1oo1o iili1oo1oVar = new iili1oo1o(i3);
/* 247 */                       iili1oo1oVar.I00iiO = ii01ii1oi1l;
/* 249 */                       iili1oo1oVar.I00iio = ioli1oioi0o;
/* 251 */                       iili1oo1oVar.I00iiI = i4;
/* 253 */                       iili1oo1oVar.I00ilI0I1 = ioli0o0iiioI00000oOI;
/* 255 */                       VarHandle.storeStoreFence();
/* 258 */                       executor.execute(iili1oo1oVar);
/* 261 */                       iIiOOI.I0000O(ioli0o0iiioI00000oOI);
                                break;
                            } else if (i == 5) {
/* 177 */                       parcel.readString();
/* 180 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 185 */                       IlloOIoilIl illoOIoilIl = new IlloOIoilIl(5);
/* 188 */                       illoOIoilIl.I00iiI = ii01ii1oi1l;
/* 190 */                       illoOIoilIl.I00iiO = ioli1oioi0o;
/* 192 */                       VarHandle.storeStoreFence();
/* 195 */                       executor.execute(illoOIoilIl);
/* 198 */                       iIiOOI.I00000oOI(null);
                                break;
                            } else {
                                break;
                            }
                        default:
/* 25 */                    Executor executor2 = il00iioo1.I00iiO;
/* 27 */                    if (i == 2) {
/* 136 */                       parcel.readString();
/* 139 */                       long j3 = parcel.readLong();
/* 143 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 148 */                       iilll11ii10I iilll11ii10i3 = new iilll11ii10I(2);
/* 151 */                       iilll11ii10i3.I00iiI = ii01ii1oi1l;
/* 153 */                       iilll11ii10i3.I00iiO = ioli1oioi0o;
/* 155 */                       iilll11ii10i3.I00iio = j3;
/* 157 */                       VarHandle.storeStoreFence();
/* 160 */                       executor2.execute(iilll11ii10i3);
                                break;
                            } else if (i == 3) {
/* 108 */                       parcel.readString();
/* 111 */                       long j4 = parcel.readLong();
/* 115 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 120 */                       iilll11ii10I iilll11ii10i4 = new iilll11ii10I(3);
/* 123 */                       iilll11ii10i4.I00iiI = ii01ii1oi1l;
/* 125 */                       iilll11ii10i4.I00iiO = ioli1oioi0o;
/* 127 */                       iilll11ii10i4.I00iio = j4;
/* 129 */                       VarHandle.storeStoreFence();
/* 132 */                       executor2.execute(iilll11ii10i4);
                                break;
                            } else if (i == 4) {
/* 63 */                        String string3 = parcel.readString();
/* 67 */                        String string4 = parcel.readString();
/* 71 */                        iil0Ii00oOI1.I00000oIO(parcel);
/* 74 */                        Locale locale2 = Locale.ENGLISH;
/* 82 */                        iOlI0O0iIiO ioli0o0iiioI00000oOI2 = iOlI0O0iIiO.I00000oOI(0, Oi010OO0.I001IO000("Feature ", string3, " failed with failure ", string4, "."), null);
/* 89 */                        O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(6);
/* 92 */                        o10oO1IiI1.I00iiI = ii01ii1oi1l;
/* 94 */                        o10oO1IiI1.I00iiO = ioli1oioi0o;
/* 96 */                        o10oO1IiI1.I00iio = ioli0o0iiioI00000oOI2;
/* 98 */                        VarHandle.storeStoreFence();
/* 101 */                       executor2.execute(o10oO1IiI1);
/* 104 */                       iIiOOI.I0000O(ioli0o0iiioI00000oOI2);
                                break;
                            } else if (i == 5) {
/* 38 */                        parcel.readString();
/* 41 */                        iil0Ii00oOI1.I00000oIO(parcel);
/* 46 */                        iooiio1i0 iooiio1i0Var = new iooiio1i0(5);
/* 49 */                        iooiio1i0Var.I00iiI = ii01ii1oi1l;
/* 51 */                        iooiio1i0Var.I00iiO = ioli1oioi0o;
/* 53 */                        VarHandle.storeStoreFence();
/* 56 */                        executor2.execute(iooiio1i0Var);
/* 59 */                        iIiOOI.I00000oOI(null);
                                break;
                            } else {
                                break;
                            }
                    }
/* 17 */            return true;
                }
            }
