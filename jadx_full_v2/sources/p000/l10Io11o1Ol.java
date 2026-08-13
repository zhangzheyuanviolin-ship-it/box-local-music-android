            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Optional;
            import java.util.stream.Stream;
            
            public final class l10Io11o1Ol extends ioii01Ii100 {
                public static final int I000l1 = 0;
                public Optional I000iOII;

                public static l0Il1Ooi I000II(o0Il0Ii1 o0il0ii1) {
/* 2 */             if (o0il0ii1 == null) {
/* 1 */                 return null;
                    }
/* 13 */            Stream map = o0il0ii1.I00iOIl.stream().map(i0OIIoiOl1I.I0000Il00O);
/* 17 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 29 */            lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I((List) map.collect(lIoiIOo0.I00000oIO));
/* 33 */            l0Il1Ooi l0il1ooi = new l0Il1Ooi();
/* 36 */            if (loi1lll1l10I000o00OoI0I == null) {
/* 46 */                IOOlIIilOl0.I000II("Null citationSources");
/* 1 */                 return null;
                    }
/* 38 */            l0il1ooi.I00000oIO = loi1lll1l10I000o00OoI0I;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return l0il1ooi;
                }

                @Override
                public final Object I00000oOI(iIolOi01l0o iioloi01l0o) {
                    ii1111I ii1111i;
/* 3 */             this.I000iOII.isPresent();
/* 8 */             lOiIOoIi11I loiiooii11iI00000oIO = this.I00000oOI.I00000oIO();
/* 12 */            iIlI1O1liI0 iili1o1lii0 = (iIlI1O1liI0) iioloi01l0o;
/* 14 */            Parcel parcelI00Iooi00oi = iili1o1lii0.I00Iooi00oi();
/* 18 */            int i = lO0Ooi.I00000oIO;
/* 21 */            parcelI00Iooi00oi.writeInt(1);
/* 25 */            loiiooii11iI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 29 */            Parcel parcelI00O0i0ii = iili1o1lii0.I00O0i0ii(5, parcelI00Iooi00oi);
/* 33 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 37 */            if (strongBinder == null) {
/* 39 */                ii1111i = null;
                    } else {
/* 43 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMService");
/* 59 */                ii1111i = iInterfaceQueryLocalInterface instanceof ii1111I ? (ii1111I) iInterfaceQueryLocalInterface : new ii1111I(strongBinder, "com.google.android.apps.aicore.aidl.ILLMService", 12);
                    }
/* 63 */            parcelI00O0i0ii.recycle();
/* 77 */            return ii1111i;
                }

                @Override
                public final iOio1i0 I0000Il00O(Object obj, Object obj2, IlloIo0O illoIo0O) {
/* 1 */             ii1111I ii1111i = (ii1111I) obj;
/* 3 */             l0OlI0ioiIli l0oli0ioiili = (l0OlI0ioiIli) obj2;
/* 17 */            iOio1i0 iooiii11ooi1 = null;
/* 18 */            if (l0oli0ioiili.I00000oIO.stream().anyMatch(il1iO10iO.I0000Il00O) && this.I00000oOI.I0000O != 12) {
/* 32 */                Log.w("l10Io11o1Ol", "Audio input is only supported for LEGION features");
/* 44 */                illoIo0O.I00iOIl.I0000O(ilIoOl.I00000oOI(3, null, "Inference failed."));
/* 49 */                return new l01iOolo();
                    }
/* 53 */            iiloi0IlI iiloi0iliI00000oIO = l0oli0ioiili.I00000oIO();
/* 59 */            l0ool0I1 l0ool0i1 = new l0ool0I1(this, illoIo0O, iiloi0iliI00000oIO);
/* 62 */            Parcel parcelI00Iooi00oi = ii1111i.I00Iooi00oi();
/* 66 */            int i = lO0Ooi.I00000oIO;
/* 69 */            parcelI00Iooi00oi.writeInt(1);
/* 73 */            iiloi0iliI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 76 */            parcelI00Iooi00oi.writeStrongBinder(l0ool0i1);
/* 80 */            Parcel parcelI00O0i0ii = ii1111i.I00O0i0ii(6, parcelI00Iooi00oi);
/* 84 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 88 */            if (strongBinder != null) {
/* 93 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 107 */               iooiii11ooi1 = iInterfaceQueryLocalInterface instanceof iOio1i0 ? (iOio1i0) iInterfaceQueryLocalInterface : new iOOiii11OOI1(strongBinder);
                    }
/* 110 */           parcelI00O0i0ii.recycle();
/* 408 */           return iooiii11ooi1;
                }

                @Override
                public final iOio1i0 I0000O(Object obj, io0O1l io0o1l) {
/* 1 */             ii1111I ii1111i = (ii1111I) obj;
/* 8 */             Parcel parcelI00O0i0ii = ii1111i.I00O0i0ii(4, ii1111i.I00Iooi00oi());
/* 12 */            int i = parcelI00O0i0ii.readInt();
/* 16 */            parcelI00O0i0ii.recycle();
/* 19 */            iOio1i0 iooiii11ooi1 = null;
/* 20 */            if (i <= 0) {
/* 26 */                Log.w("l10Io11o1Ol", "Ignoring prepareInferenceEngine because service is older than V2");
/* 38 */                io0o1l.I000OOo1O.I0000O(ilIoOl.I0000Il00O(3, null, "Preparation failed."));
/* 43 */                return new l01iOolo();
                    }
/* 47 */            Parcel parcelI00Iooi00oi = ii1111i.I00Iooi00oi();
/* 51 */            int i2 = lO0Ooi.I00000oIO;
/* 53 */            parcelI00Iooi00oi.writeStrongBinder(io0o1l);
/* 57 */            Parcel parcelI00O0i0ii2 = ii1111i.I00O0i0ii(5, parcelI00Iooi00oi);
/* 61 */            IBinder strongBinder = parcelI00O0i0ii2.readStrongBinder();
/* 65 */            if (strongBinder != null) {
/* 70 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 83 */                iooiii11ooi1 = iInterfaceQueryLocalInterface instanceof iOio1i0 ? (iOio1i0) iInterfaceQueryLocalInterface : new iOOiii11OOI1(strongBinder);
                    }
/* 86 */            parcelI00O0i0ii2.recycle();
/* 106 */           return iooiii11ooi1;
                }

                @Override
                public final iOio1i0 I0000oI00(Object obj, Object obj2, io0O1l io0o1l) {
                    iOio1i0 iooiii11ooi1;
/* 1 */             l0OlI0ioiIli l0oli0ioiili = (l0OlI0ioiIli) obj;
/* 3 */             ii1111I ii1111i = (ii1111I) obj2;
/* 10 */            Parcel parcelI00O0i0ii = ii1111i.I00O0i0ii(4, ii1111i.I00Iooi00oi());
/* 14 */            int i = parcelI00O0i0ii.readInt();
/* 18 */            parcelI00O0i0ii.recycle();
/* 22 */            if (i < 2) {
/* 28 */                Log.w("l10Io11o1Ol", "Ignoring getTokenInfo because service is older than V3");
/* 45 */                io0o1l.I000OOo1O.I0000O(new ilIoOl(5, 16, "Tokenization failed.", null, null));
/* 50 */                return new l01iOolo();
                    }
/* 54 */            iiloi0IlI iiloi0iliI00000oIO = l0oli0ioiili.I00000oIO();
/* 58 */            Parcel parcelI00Iooi00oi = ii1111i.I00Iooi00oi();
/* 62 */            int i2 = lO0Ooi.I00000oIO;
/* 65 */            parcelI00Iooi00oi.writeInt(1);
/* 69 */            iiloi0iliI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 72 */            parcelI00Iooi00oi.writeInt(1);
/* 75 */            parcelI00Iooi00oi.writeStrongBinder(io0o1l);
/* 79 */            Parcel parcelI00O0i0ii2 = ii1111i.I00O0i0ii(7, parcelI00Iooi00oi);
/* 83 */            IBinder strongBinder = parcelI00O0i0ii2.readStrongBinder();
/* 87 */            if (strongBinder == null) {
/* 89 */                iooiii11ooi1 = null;
                    } else {
/* 93 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 107 */               iooiii11ooi1 = iInterfaceQueryLocalInterface instanceof iOio1i0 ? (iOio1i0) iInterfaceQueryLocalInterface : new iOOiii11OOI1(strongBinder);
                    }
/* 111 */           parcelI00O0i0ii2.recycle();
/* 408 */           return iooiii11ooi1;
                }
            }
