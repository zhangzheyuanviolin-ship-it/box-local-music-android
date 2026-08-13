            package p000;

            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.util.Pair;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ilo0io extends i0IiIO implements iOolill0lii {
                public final Executor I000O01llI0;
                public final illIIi01 I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilo0io(illIIi01 illiii01, Executor executor) {
/* 9 */             super("com.google.android.apps.aicore.aidl.ICortanaStateCallback", 10);
/* 1 */             this.I000O01llI0 = executor;
/* 3 */             this.I000OOo1O = illiii01;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 2 */             if (i != 2) {
/* 67 */                return false;
                    }
/* 10 */            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) lO0Ooi.I00000oIO(parcel, ParcelFileDescriptor.CREATOR);
/* 12 */            lO0Ooi.I00000oOI(parcel);
/* 17 */            illIIi01 illiii01 = this.I000OOo1O;
/* 21 */            Pair pairCreate = Pair.create(parcelFileDescriptor, illiii01.I00000oIO);
/* 25 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 27 */            Object[] objArr = {pairCreate};
/* 32 */            ll0lIii.I00000oIO(1, objArr);
/* 35 */            lOl10OOloi lol10ooloiI000oI1ioi = lOI1lll1l10.I000oI1ioi(1, objArr);
/* 39 */            i1IoOl i1iool = new i1IoOl();
/* 44 */            i1iool.I00iOIl = this.I000O01llI0;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            OoIol00Ool ooIol00Ool = illiii01.I0000Il00O;
/* 53 */            l00lIII1I10 l00liii1i10 = new l00lIII1I10();
/* 56 */            l00liii1i10.I00000oIO = i1iool;
/* 58 */            l00liii1i10.I00000oOI = ooIol00Ool;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            lol10ooloiI000oI1ioi.forEach(l00liii1i10);
/* 31 */            return true;
                }
            }
