            package p000;

            import android.os.Parcel;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.Executor;
            
            public final class iioI0O10i extends i0IiIO {
                public final int I000O01llI0;
                public final ii0IiOii I000OOo1O;
                public final iOioIII1i I000OiO;
                public final IIiOOI I000iOII;
                public final il0I11I011 I000l1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iioI0O10i(il0I11I011 il0i11i011, ii0IiOii ii0iioii, iOioIII1i ioioiii1i, IIiOOI iIiOOI, int i) {
/* 17 */            super("com.google.android.apps.aicore.aidl.IDownloadListener2", 3);
/* 1 */             this.I000O01llI0 = i;
                    switch (i) {
                        case 1:
/* 21 */                    this.I000OOo1O = ii0iioii;
/* 23 */                    this.I000OiO = ioioiii1i;
/* 25 */                    this.I000iOII = iIiOOI;
/* 27 */                    this.I000l1 = il0i11i011;
/* 31 */                    super("com.google.android.apps.aicore.aidl.IDownloadListener", 3);
                            break;
                        default:
/* 7 */                     this.I000OOo1O = ii0iioii;
/* 9 */                     this.I000OiO = ioioiii1i;
/* 11 */                    this.I000iOII = iIiOOI;
/* 13 */                    this.I000l1 = il0i11i011;
                            break;
                    }
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 8 */             il0I11I011 il0i11i011 = this.I000l1;
/* 10 */            ii0IiOii ii0iioii = this.I000OOo1O;
/* 12 */            iOioIII1i ioioiii1i = this.I000OiO;
/* 14 */            IIiOOI iIiOOI = this.I000iOII;
/* 20 */            int i3 = 1;
                    switch (i2) {
                        case 0:
/* 164 */                   Executor executor = il0i11i011.I00iiO;
/* 166 */                   if (i == 2) {
/* 290 */                       parcel.readString();
/* 293 */                       long j = parcel.readLong();
/* 297 */                       iil0I01i.I00000oIO(parcel);
/* 302 */                       iio010OI0l iio010oi0l = new iio010OI0l(0);
/* 305 */                       iio010oi0l.I00iiI = ii0iioii;
/* 307 */                       iio010oi0l.I00iiO = ioioiii1i;
/* 309 */                       iio010oi0l.I00iio = j;
/* 311 */                       VarHandle.storeStoreFence();
/* 314 */                       executor.execute(iio010oi0l);
                            } else if (i == 3) {
/* 262 */                       parcel.readString();
/* 265 */                       long j2 = parcel.readLong();
/* 269 */                       iil0I01i.I00000oIO(parcel);
/* 274 */                       iio010OI0l iio010oi0l2 = new iio010OI0l(1);
/* 277 */                       iio010oi0l2.I00iiI = ii0iioii;
/* 279 */                       iio010oi0l2.I00iiO = ioioiii1i;
/* 281 */                       iio010oi0l2.I00iio = j2;
/* 283 */                       VarHandle.storeStoreFence();
/* 286 */                       executor.execute(iio010oi0l2);
                            } else if (i == 4) {
/* 202 */                       String string = parcel.readString();
/* 206 */                       int i4 = parcel.readInt();
/* 210 */                       String string2 = parcel.readString();
/* 214 */                       iil0I01i.I00000oIO(parcel);
/* 217 */                       Locale locale = Locale.ENGLISH;
/* 235 */                       iOiI1oOo1l ioii1ooo1lI00000oOI = iOiI1oOo1l.I00000oOI(i4 == 1 ? GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE : 0, IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(i4, "Feature ", string, " failed with failure status ", " and error "), string2, "."), null);
/* 241 */                       iili1oo1o iili1oo1oVar = new iili1oo1o(i3);
/* 244 */                       iili1oo1oVar.I00iiO = ii0iioii;
/* 246 */                       iili1oo1oVar.I00iio = ioioiii1i;
/* 248 */                       iili1oo1oVar.I00iiI = i4;
/* 250 */                       iili1oo1oVar.I00ilI0I1 = ioii1ooo1lI00000oOI;
/* 252 */                       VarHandle.storeStoreFence();
/* 255 */                       executor.execute(iili1oo1oVar);
/* 258 */                       iIiOOI.I0000O(ioii1ooo1lI00000oOI);
                            } else if (i == 5) {
/* 176 */                       parcel.readString();
/* 179 */                       iil0I01i.I00000oIO(parcel);
/* 184 */                       IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(5);
/* 187 */                       illoOi1I1OO.I00iiI = ii0iioii;
/* 189 */                       illoOi1I1OO.I00iiO = ioioiii1i;
/* 191 */                       VarHandle.storeStoreFence();
/* 194 */                       executor.execute(illoOi1I1OO);
/* 197 */                       iIiOOI.I00000oOI(null);
                            }
                            break;
                        default:
/* 25 */                    Executor executor2 = il0i11i011.I00iiO;
/* 27 */                    if (i == 2) {
/* 135 */                       parcel.readString();
/* 138 */                       long j3 = parcel.readLong();
/* 142 */                       iil0I01i.I00000oIO(parcel);
/* 147 */                       iio010OI0l iio010oi0l3 = new iio010OI0l(2);
/* 150 */                       iio010oi0l3.I00iiI = ii0iioii;
/* 152 */                       iio010oi0l3.I00iiO = ioioiii1i;
/* 154 */                       iio010oi0l3.I00iio = j3;
/* 156 */                       VarHandle.storeStoreFence();
/* 159 */                       executor2.execute(iio010oi0l3);
                            } else if (i == 3) {
/* 107 */                       parcel.readString();
/* 110 */                       long j4 = parcel.readLong();
/* 114 */                       iil0I01i.I00000oIO(parcel);
/* 119 */                       iio010OI0l iio010oi0l4 = new iio010OI0l(3);
/* 122 */                       iio010oi0l4.I00iiI = ii0iioii;
/* 124 */                       iio010oi0l4.I00iiO = ioioiii1i;
/* 126 */                       iio010oi0l4.I00iio = j4;
/* 128 */                       VarHandle.storeStoreFence();
/* 131 */                       executor2.execute(iio010oi0l4);
                            } else if (i == 4) {
/* 62 */                        String string3 = parcel.readString();
/* 66 */                        String string4 = parcel.readString();
/* 70 */                        iil0I01i.I00000oIO(parcel);
/* 73 */                        Locale locale2 = Locale.ENGLISH;
/* 81 */                        iOiI1oOo1l ioii1ooo1lI00000oOI2 = iOiI1oOo1l.I00000oOI(0, Oi010OO0.I001IO000("Feature ", string3, " failed with failure ", string4, "."), null);
/* 88 */                        O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(7);
/* 91 */                        o10oO1IiI1.I00iiI = ii0iioii;
/* 93 */                        o10oO1IiI1.I00iiO = ioioiii1i;
/* 95 */                        o10oO1IiI1.I00iio = ioii1ooo1lI00000oOI2;
/* 97 */                        VarHandle.storeStoreFence();
/* 100 */                       executor2.execute(o10oO1IiI1);
/* 103 */                       iIiOOI.I0000O(ioii1ooo1lI00000oOI2);
                            } else if (i == 5) {
/* 37 */                        parcel.readString();
/* 40 */                        iil0I01i.I00000oIO(parcel);
/* 45 */                        iooili01 iooili01Var = new iooili01(5);
/* 48 */                        iooili01Var.I00iiI = ii0iioii;
/* 50 */                        iooili01Var.I00iiO = ioioiii1i;
/* 52 */                        VarHandle.storeStoreFence();
/* 55 */                        executor2.execute(iooili01Var);
/* 58 */                        iIiOOI.I00000oOI(null);
                            }
                            break;
                    }
/* 20 */            return true;
                }
            }
