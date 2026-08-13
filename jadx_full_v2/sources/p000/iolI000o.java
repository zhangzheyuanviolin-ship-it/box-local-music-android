            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class iolI000o extends i0I1ioiiIioI implements iolll0ill1i {
                public iolI000o(IBinder iBinder) {
/* 5 */             super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 11);
                }

                @Override
                public final void I0000Il00O(lli10iI lli10ii, Bundle bundle, ioo1oIl0i10O ioo1oil0i10o) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, bundle);
/* 11 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, ioo1oil0i10o);
/* 16 */            I00O0o1oo(31, parcelI00Iooi00oi);
                }

                @Override
                public final List I0001Ioi1lo(String str, String str2, String str3, boolean z) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 6 */             parcelI00Iooi00oi.writeString(null);
/* 9 */             parcelI00Iooi00oi.writeString(str2);
/* 12 */            parcelI00Iooi00oi.writeString(str3);
/* 15 */            ClassLoader classLoader = iiIIoi1oIO1.I00000oIO;
/* 17 */            parcelI00Iooi00oi.writeInt(z ? 1 : 0);
/* 22 */            Parcel parcelI00IoiI = I00IoiI(15, parcelI00Iooi00oi);
/* 28 */            ArrayList arrayListCreateTypedArrayList = parcelI00IoiI.createTypedArrayList(lio0llOI0.CREATOR);
/* 32 */            parcelI00IoiI.recycle();
/* 204 */           return arrayListCreateTypedArrayList;
                }

                @Override
                public final void I000OOo1O(ii0oooi0IO0l ii0oooi0io0l, lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, ii0oooi0io0l);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 12 */            I00O0o1oo(1, parcelI00Iooi00oi);
                }

                @Override
                public final String I000OiO(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            Parcel parcelI00IoiI = I00IoiI(11, parcelI00Iooi00oi);
/* 14 */            String string = parcelI00IoiI.readString();
/* 18 */            parcelI00IoiI.recycle();
/* 29 */            return string;
                }

                @Override
                public final List I000iOII(String str, String str2, lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             parcelI00Iooi00oi.writeString(str);
/* 8 */             parcelI00Iooi00oi.writeString(str2);
/* 11 */            iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 16 */            Parcel parcelI00IoiI = I00IoiI(16, parcelI00Iooi00oi);
/* 22 */            ArrayList arrayListCreateTypedArrayList = parcelI00IoiI.createTypedArrayList(iII000ol000.CREATOR);
/* 26 */            parcelI00IoiI.recycle();
/* 98 */            return arrayListCreateTypedArrayList;
                }

                @Override
                public final void I000l1(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            I00O0o1oo(20, parcelI00Iooi00oi);
                }

                @Override
                public final void I000o00OoI0I(long j, String str, String str2, String str3) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             parcelI00Iooi00oi.writeLong(j);
/* 8 */             parcelI00Iooi00oi.writeString(str);
/* 11 */            parcelI00Iooi00oi.writeString(str2);
/* 14 */            parcelI00Iooi00oi.writeString(str3);
/* 19 */            I00O0o1oo(10, parcelI00Iooi00oi);
                }

                @Override
                public final iO0Ol0ol I000oI1ioi(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            Parcel parcelI00IoiI = I00IoiI(21, parcelI00Iooi00oi);
/* 20 */            iO0Ol0ol io0ol0ol = (iO0Ol0ol) iiIIoi1oIO1.I00000oIO(parcelI00IoiI, iO0Ol0ol.CREATOR);
/* 22 */            parcelI00IoiI.recycle();
/* 29 */            return io0ol0ol;
                }

                @Override
                public final List I00100l0(String str, String str2, String str3) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 6 */             parcelI00Iooi00oi.writeString(null);
/* 9 */             parcelI00Iooi00oi.writeString(str2);
/* 12 */            parcelI00Iooi00oi.writeString(str3);
/* 17 */            Parcel parcelI00IoiI = I00IoiI(17, parcelI00Iooi00oi);
/* 23 */            ArrayList arrayListCreateTypedArrayList = parcelI00IoiI.createTypedArrayList(iII000ol000.CREATOR);
/* 27 */            parcelI00IoiI.recycle();
/* 98 */            return arrayListCreateTypedArrayList;
                }

                @Override
                public final void I00100o1O0lo(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 9 */             I00O0o1oo(4, parcelI00Iooi00oi);
                }

                @Override
                public final void I0010o(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            I00O0o1oo(25, parcelI00Iooi00oi);
                }

                @Override
                public final void I00111O(lli10iI lli10ii, liIlli liilli, iooliIoiiOlo iooliioiiolo) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, liilli);
/* 11 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, iooliioiiolo);
/* 16 */            I00O0o1oo(29, parcelI00Iooi00oi);
                }

                @Override
                public final void I001IO000(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            I00O0o1oo(26, parcelI00Iooi00oi);
                }

                @Override
                public final void I001i1O0Ol(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 9 */             I00O0o1oo(6, parcelI00Iooi00oi);
                }

                @Override
                public final void I001iOo1i0O(iII000ol000 iii000ol000, lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, iii000ol000);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 13 */            I00O0o1oo(12, parcelI00Iooi00oi);
                }

                @Override
                public final void I00II0Ol1O0l(lio0llOI0 lio0lloi0, lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lio0lloi0);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 12 */            I00O0o1oo(2, parcelI00Iooi00oi);
                }

                @Override
                public final byte[] I00IO1oi11O(String str, ii0oooi0IO0l ii0oooi0io0l) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, ii0oooi0io0l);
/* 8 */             parcelI00Iooi00oi.writeString(str);
/* 13 */            Parcel parcelI00IoiI = I00IoiI(9, parcelI00Iooi00oi);
/* 17 */            byte[] bArrCreateByteArray = parcelI00IoiI.createByteArray();
/* 21 */            parcelI00IoiI.recycle();
/* 37 */            return bArrCreateByteArray;
                }

                @Override
                public final void I00IOO(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            I00O0o1oo(18, parcelI00Iooi00oi);
                }

                @Override
                public final void I00IioO0OiOi(lli10iI lli10ii, iI0iiII1i ii0iiii1i) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, ii0iiii1i);
/* 13 */            I00O0o1oo(30, parcelI00Iooi00oi);
                }

                @Override
                public final void I00IlilI0i0i(lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 10 */            I00O0o1oo(27, parcelI00Iooi00oi);
                }

                @Override
                public final void I00Io1lO(Bundle bundle, lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, bundle);
/* 8 */             iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 13 */            I00O0o1oo(19, parcelI00Iooi00oi);
                }

                @Override
                public final List I00Io1o110i(String str, String str2, boolean z, lli10iI lli10ii) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             parcelI00Iooi00oi.writeString(str);
/* 8 */             parcelI00Iooi00oi.writeString(str2);
/* 11 */            ClassLoader classLoader = iiIIoi1oIO1.I00000oIO;
/* 13 */            parcelI00Iooi00oi.writeInt(z ? 1 : 0);
/* 16 */            iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, lli10ii);
/* 21 */            Parcel parcelI00IoiI = I00IoiI(14, parcelI00Iooi00oi);
/* 27 */            ArrayList arrayListCreateTypedArrayList = parcelI00IoiI.createTypedArrayList(lio0llOI0.CREATOR);
/* 31 */            parcelI00IoiI.recycle();
/* 204 */           return arrayListCreateTypedArrayList;
                }
            }
