            package p000;

            import android.os.Parcel;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.Objects;
            
            public final class ioll1i1llO extends i0IiIO {
                public final ili0l0oo0 I000O01llI0;
                public final ilOiOOII0I0 I000OOo1O;
                public final IIiOOI I000OiO;
                public final l00Iil I000iOII;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ioll1i1llO(l00Iil l00iil, ili0l0oo0 ili0l0oo0Var, ilOiOOII0I0 iloiooii0i0, IIiOOI iIiOOI) {
/* 16 */            super("com.google.android.apps.aicore.aidl.IDownloadListener2", 10);
/* 1 */             this.I000O01llI0 = ili0l0oo0Var;
/* 3 */             this.I000OOo1O = iloiooii0i0;
/* 5 */             this.I000OiO = iIiOOI;
/* 7 */             Objects.requireNonNull(l00iil);
/* 10 */            this.I000iOII = l00iil;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 3 */             l00Iil l00iil = this.I000iOII;
/* 5 */             ili0l0oo0 ili0l0oo0Var = this.I000O01llI0;
/* 7 */             if (i == 2) {
/* 141 */               parcel.readString();
/* 144 */               long j = parcel.readLong();
/* 148 */               lO0Ooi.I00000oOI(parcel);
/* 153 */               ioilOIoO ioiloioo = new ioilOIoO(1);
/* 156 */               ioiloioo.I00iiI = ili0l0oo0Var;
/* 158 */               ioiloioo.I00iiO = j;
/* 160 */               VarHandle.storeStoreFence();
/* 165 */               l00iil.I00iiO.execute(ioiloioo);
/* 2 */                 return true;
                    }
/* 11 */            if (i == 3) {
/* 113 */               parcel.readString();
/* 116 */               long j2 = parcel.readLong();
/* 120 */               lO0Ooi.I00000oOI(parcel);
/* 125 */               ioilOIoO ioiloioo2 = new ioilOIoO(0);
/* 128 */               ioiloioo2.I00iiI = ili0l0oo0Var;
/* 130 */               ioiloioo2.I00iiO = j2;
/* 132 */               VarHandle.storeStoreFence();
/* 137 */               l00iil.I00iiO.execute(ioiloioo2);
/* 2 */                 return true;
                    }
/* 15 */            IIiOOI iIiOOI = this.I000OiO;
/* 17 */            if (i != 4) {
/* 20 */                if (i != 5) {
/* 10 */                    return false;
                        }
/* 23 */                parcel.readString();
/* 26 */                lO0Ooi.I00000oOI(parcel);
/* 33 */                I0lil01 i0lil01 = new I0lil01(25);
/* 36 */                i0lil01.I00iiI = ili0l0oo0Var;
/* 38 */                VarHandle.storeStoreFence();
/* 43 */                l00iil.I00iiO.execute(i0lil01);
/* 46 */                iIiOOI.I00000oOI(null);
/* 2 */                 return true;
                    }
/* 50 */            String string = parcel.readString();
/* 54 */            int i2 = parcel.readInt();
/* 58 */            String string2 = parcel.readString();
/* 62 */            lO0Ooi.I00000oOI(parcel);
/* 65 */            Locale locale = Locale.ENGLISH;
/* 87 */            ilIoOl ilioolI00000oIO = ilIoOl.I00000oIO(i2 == 1 ? GenAiException.ErrorCode.NOT_ENOUGH_DISK_SPACE : 0, null, IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(i2, "Feature ", string, " failed with failure status ", " and error "), string2, "."));
/* 94 */            liOO1i1 lioo1i1 = new liOO1i1(6);
/* 97 */            lioo1i1.I00iiI = ili0l0oo0Var;
/* 99 */            lioo1i1.I00iiO = ilioolI00000oIO;
/* 101 */           VarHandle.storeStoreFence();
/* 106 */           l00iil.I00iiO.execute(lioo1i1);
/* 109 */           iIiOOI.I0000O(ilioolI00000oIO);
/* 2 */             return true;
                }
            }
