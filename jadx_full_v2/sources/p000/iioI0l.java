            package p000;

            import android.os.Parcel;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.Executor;
            
            public final class iioI0l extends i0IiIO {
                public final int I000O01llI0;
                public final ii0IiiI I000OOo1O;
                public final iOioO0lIOo I000OiO;
                public final IIiOOI I000iOII;
                public final il0I1i0Oo1 I000l1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iioI0l(il0I1i0Oo1 il0i1i0oo1, ii0IiiI ii0iiii, iOioO0lIOo ioioo0lioo, IIiOOI iIiOOI, int i) {
/* 17 */            super("com.google.android.apps.aicore.aidl.IDownloadListener2", 4);
/* 1 */             this.I000O01llI0 = i;
                    switch (i) {
                        case 1:
/* 21 */                    this.I000OOo1O = ii0iiii;
/* 23 */                    this.I000OiO = ioioo0lioo;
/* 25 */                    this.I000iOII = iIiOOI;
/* 27 */                    this.I000l1 = il0i1i0oo1;
/* 31 */                    super("com.google.android.apps.aicore.aidl.IDownloadListener", 4);
                            break;
                        default:
/* 7 */                     this.I000OOo1O = ii0iiii;
/* 9 */                     this.I000OiO = ioioo0lioo;
/* 11 */                    this.I000iOII = iIiOOI;
/* 13 */                    this.I000l1 = il0i1i0oo1;
                            break;
                    }
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 8 */             il0I1i0Oo1 il0i1i0oo1 = this.I000l1;
/* 10 */            ii0IiiI ii0iiii = this.I000OOo1O;
/* 12 */            iOioO0lIOo ioioo0lioo = this.I000OiO;
/* 14 */            IIiOOI iIiOOI = this.I000iOII;
/* 21 */            int i3 = 2;
                    switch (i2) {
                        case 0:
/* 165 */                   Executor executor = il0i1i0oo1.I00iiO;
/* 167 */                   if (i == 2) {
/* 291 */                       parcel.readString();
/* 294 */                       long j = parcel.readLong();
/* 298 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 303 */                       iio010ol iio010olVar = new iio010ol(0);
/* 306 */                       iio010olVar.I00iiI = ii0iiii;
/* 308 */                       iio010olVar.I00iiO = ioioo0lioo;
/* 310 */                       iio010olVar.I00iio = j;
/* 312 */                       VarHandle.storeStoreFence();
/* 315 */                       executor.execute(iio010olVar);
                                break;
                            } else if (i == 3) {
/* 263 */                       parcel.readString();
/* 266 */                       long j2 = parcel.readLong();
/* 270 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 275 */                       iio010ol iio010olVar2 = new iio010ol(1);
/* 278 */                       iio010olVar2.I00iiI = ii0iiii;
/* 280 */                       iio010olVar2.I00iiO = ioioo0lioo;
/* 282 */                       iio010olVar2.I00iio = j2;
/* 284 */                       VarHandle.storeStoreFence();
/* 287 */                       executor.execute(iio010olVar2);
                                break;
                            } else if (i == 4) {
/* 203 */                       String string = parcel.readString();
/* 207 */                       int i4 = parcel.readInt();
/* 211 */                       String string2 = parcel.readString();
/* 215 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 218 */                       Locale locale = Locale.ENGLISH;
/* 236 */                       iOiIOO1ll ioiioo1llI00000oOI = iOiIOO1ll.I00000oOI(i4 == 1 ? GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE : 0, IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(i4, "Feature ", string, " failed with failure status ", " and error "), string2, "."), null);
/* 242 */                       iili1oo1o iili1oo1oVar = new iili1oo1o(i3);
/* 245 */                       iili1oo1oVar.I00iiO = ii0iiii;
/* 247 */                       iili1oo1oVar.I00iio = ioioo0lioo;
/* 249 */                       iili1oo1oVar.I00iiI = i4;
/* 251 */                       iili1oo1oVar.I00ilI0I1 = ioiioo1llI00000oOI;
/* 253 */                       VarHandle.storeStoreFence();
/* 256 */                       executor.execute(iili1oo1oVar);
/* 259 */                       iIiOOI.I0000O(ioiioo1llI00000oOI);
                                break;
                            } else if (i == 5) {
/* 178 */                       parcel.readString();
/* 181 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 186 */                       illioiliioi illioiliioiVar = new illioiliioi(5);
/* 189 */                       illioiliioiVar.I00iiI = ii0iiii;
/* 191 */                       illioiliioiVar.I00iiO = ioioo0lioo;
/* 193 */                       VarHandle.storeStoreFence();
/* 196 */                       executor.execute(illioiliioiVar);
/* 199 */                       iIiOOI.I00000oOI(null);
                                break;
                            } else {
                                break;
                            }
                        default:
/* 25 */                    Executor executor2 = il0i1i0oo1.I00iiO;
/* 27 */                    if (i == 2) {
/* 137 */                       parcel.readString();
/* 140 */                       long j3 = parcel.readLong();
/* 144 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 149 */                       iio010ol iio010olVar3 = new iio010ol(2);
/* 152 */                       iio010olVar3.I00iiI = ii0iiii;
/* 154 */                       iio010olVar3.I00iiO = ioioo0lioo;
/* 156 */                       iio010olVar3.I00iio = j3;
/* 158 */                       VarHandle.storeStoreFence();
/* 161 */                       executor2.execute(iio010olVar3);
                                break;
                            } else if (i == 3) {
/* 109 */                       parcel.readString();
/* 112 */                       long j4 = parcel.readLong();
/* 116 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 121 */                       iio010ol iio010olVar4 = new iio010ol(3);
/* 124 */                       iio010olVar4.I00iiI = ii0iiii;
/* 126 */                       iio010olVar4.I00iiO = ioioo0lioo;
/* 128 */                       iio010olVar4.I00iio = j4;
/* 130 */                       VarHandle.storeStoreFence();
/* 133 */                       executor2.execute(iio010olVar4);
                                break;
                            } else if (i == 4) {
/* 63 */                        String string3 = parcel.readString();
/* 67 */                        String string4 = parcel.readString();
/* 71 */                        iil0IIlIl0oo.I00000oIO(parcel);
/* 74 */                        Locale locale2 = Locale.ENGLISH;
/* 82 */                        iOiIOO1ll ioiioo1llI00000oOI2 = iOiIOO1ll.I00000oOI(0, Oi010OO0.I001IO000("Feature ", string3, " failed with failure ", string4, "."), null);
/* 90 */                        O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(8);
/* 93 */                        o10oO1IiI1.I00iiI = ii0iiii;
/* 95 */                        o10oO1IiI1.I00iiO = ioioo0lioo;
/* 97 */                        o10oO1IiI1.I00iio = ioiioo1llI00000oOI2;
/* 99 */                        VarHandle.storeStoreFence();
/* 102 */                       executor2.execute(o10oO1IiI1);
/* 105 */                       iIiOOI.I0000O(ioiioo1llI00000oOI2);
                                break;
                            } else if (i == 5) {
/* 38 */                        parcel.readString();
/* 41 */                        iil0IIlIl0oo.I00000oIO(parcel);
/* 46 */                        l0001OI0 l0001oi0 = new l0001OI0(5);
/* 49 */                        l0001oi0.I00iiI = ii0iiii;
/* 51 */                        l0001oi0.I00iiO = ioioo0lioo;
/* 53 */                        VarHandle.storeStoreFence();
/* 56 */                        executor2.execute(l0001oi0);
/* 59 */                        iIiOOI.I00000oOI(null);
                                break;
                            } else {
                                break;
                            }
                    }
/* 17 */            return true;
                }
            }
