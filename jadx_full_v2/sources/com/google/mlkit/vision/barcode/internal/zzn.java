            package com.google.mlkit.vision.barcode.internal;

            import android.graphics.Point;
            import android.graphics.Rect;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.o0liol1;
            import p000.o0ll1o0lIoll;
            import p000.o0llolO1Iol;
            import p000.o0loI0oo0I;
            import p000.o0loil0O;
            import p000.o0looOOo0;
            import p000.o0o0IiO0IoOo;
            import p000.o0o0i0ool;
            import p000.o0o0oIo0;
            import p000.o0o1O00;
            import p000.o0o1o1IOI0;
            import p000.o0oIoIIiiIo;
            import p000.o0oOI0O;
            
            public final class zzn implements BarcodeSource {
                private final o0oOI0O zza;

                public zzn(o0oOI0O o0ooi0o) {
/* 4 */             this.zza = o0ooi0o;
                }

                private static Barcode.CalendarDateTime zza(o0ll1o0lIoll o0ll1o0lioll) {
/* 1 */             if (o0ll1o0lioll == null) {
/* 3 */                 return null;
                    }
/* 23 */            return new Barcode.CalendarDateTime(o0ll1o0lioll.I00iOIl, o0ll1o0lioll.I00iiI, o0ll1o0lioll.I00iiO, o0ll1o0lioll.I00iio, o0ll1o0lioll.I00ilI0I1, o0ll1o0lioll.I00ilO0, o0ll1o0lioll.I00io1l, o0ll1o0lioll.I00ioIO);
                }

                @Override
                public final Rect getBoundingBox() {
/* 3 */             Point[] pointArr = this.zza.I00ilI0I1;
/* 5 */             if (pointArr == null) {
/* 54 */                return null;
                    }
/* 8 */             int iMax = Integer.MIN_VALUE;
/* 13 */            int iMin = Integer.MAX_VALUE;
/* 14 */            int iMin2 = Integer.MAX_VALUE;
/* 15 */            int iMax2 = Integer.MIN_VALUE;
/* 17 */            for (Point point : pointArr) {
/* 23 */                iMin = Math.min(iMin, point.x);
/* 29 */                iMax = Math.max(iMax, point.x);
/* 35 */                iMin2 = Math.min(iMin2, point.y);
/* 41 */                iMax2 = Math.max(iMax2, point.y);
                    }
/* 50 */            return new Rect(iMin, iMin2, iMax, iMax2);
                }

                @Override
                public final Barcode.CalendarEvent getCalendarEvent() {
/* 3 */             o0llolO1Iol o0llolo1iol = this.zza.I00lli11;
/* 5 */             if (o0llolo1iol != null) {
/* 31 */                return new Barcode.CalendarEvent(o0llolo1iol.I00iOIl, o0llolo1iol.I00iiI, o0llolo1iol.I00iiO, o0llolo1iol.I00iio, o0llolo1iol.I00ilI0I1, zza(o0llolo1iol.I00ilO0), zza(o0llolo1iol.I00io1l));
                    }
/* 35 */            return null;
                }

                @Override
                public final Barcode.ContactInfo getContactInfo() {
/* 3 */             o0loI0oo0I o0loi0oo0i = this.zza.I00lll10;
/* 6 */             if (o0loi0oo0i == null) {
/* 5 */                 return null;
                    }
/* 10 */            o0o0i0ool o0o0i0oolVar = o0loi0oo0i.I00iOIl;
/* 32 */            Barcode.PersonName personName = o0o0i0oolVar == null ? null : new Barcode.PersonName(o0o0i0oolVar.I00iOIl, o0o0i0oolVar.I00iiI, o0o0i0oolVar.I00iiO, o0o0i0oolVar.I00iio, o0o0i0oolVar.I00ilI0I1, o0o0i0oolVar.I00ilO0, o0o0i0oolVar.I00io1l);
/* 36 */            String str = o0loi0oo0i.I00iiI;
/* 38 */            String str2 = o0loi0oo0i.I00iiO;
/* 40 */            o0o0oIo0[] o0o0oio0Arr = o0loi0oo0i.I00iio;
/* 44 */            ArrayList arrayList = new ArrayList();
/* 48 */            if (o0o0oio0Arr != null) {
/* 52 */                for (o0o0oIo0 o0o0oio0 : o0o0oio0Arr) {
/* 56 */                    if (o0o0oio0 != null) {
/* 67 */                        arrayList.add(new Barcode.Phone(o0o0oio0.I00iiI, o0o0oio0.I00iOIl));
                            }
                        }
                    }
/* 73 */            o0looOOo0[] o0looooo0Arr = o0loi0oo0i.I00ilI0I1;
/* 78 */            ArrayList arrayList2 = new ArrayList();
/* 81 */            if (o0looooo0Arr != null) {
/* 85 */                for (o0looOOo0 o0looooo0 : o0looooo0Arr) {
/* 89 */                    if (o0looooo0 != null) {
/* 104 */                       arrayList2.add(new Barcode.Email(o0looooo0.I00iOIl, o0looooo0.I00iiI, o0looooo0.I00iiO, o0looooo0.I00iio));
                            }
                        }
                    }
/* 110 */           String[] strArr = o0loi0oo0i.I00ilO0;
/* 121 */           List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
/* 124 */           o0liol1[] o0liol1VarArr = o0loi0oo0i.I00io1l;
/* 128 */           ArrayList arrayList3 = new ArrayList();
                    if (o0liol1VarArr != null) {
/* 134 */               for (o0liol1 o0liol1Var : o0liol1VarArr) {
/* 138 */                   if (o0liol1Var != null) {
/* 149 */                       arrayList3.add(new Barcode.Address(o0liol1Var.I00iOIl, o0liol1Var.I00iiI));
                            }
                        }
                    }
/* 156 */           return new Barcode.ContactInfo(personName, str, str2, arrayList, arrayList2, listAsList, arrayList3);
                }

                @Override
                public final Point[] getCornerPoints() {
/* 3 */             return this.zza.I00ilI0I1;
                }

                @Override
                public final String getDisplayValue() {
/* 3 */             return this.zza.I00iiI;
                }

                @Override
                public final Barcode.DriverLicense getDriverLicense() {
/* 3 */             o0loil0O o0loil0o = this.zza.I00o0iI0io1;
/* 5 */             if (o0loil0o != null) {
/* 37 */                return new Barcode.DriverLicense(o0loil0o.I00iOIl, o0loil0o.I00iiI, o0loil0o.I00iiO, o0loil0o.I00iio, o0loil0o.I00ilI0I1, o0loil0o.I00ilO0, o0loil0o.I00io1l, o0loil0o.I00ioIO, o0loil0o.I00l0I0l0lO1, o0loil0o.I00l0OO0IO, o0loil0o.I00li1OI, o0loil0o.I00ll1, o0loil0o.I00lli11, o0loil0o.I00lll10);
                    }
/* 41 */            return null;
                }

                @Override
                public final Barcode.Email getEmail() {
/* 3 */             o0looOOo0 o0looooo0 = this.zza.I00io1l;
/* 5 */             if (o0looooo0 == null) {
/* 7 */                 return null;
                    }
/* 19 */            return new Barcode.Email(o0looooo0.I00iOIl, o0looooo0.I00iiI, o0looooo0.I00iiO, o0looooo0.I00iio);
                }

                @Override
                public final int getFormat() {
/* 3 */             return this.zza.I00iOIl;
                }

                @Override
                public final Barcode.GeoPoint getGeoPoint() {
/* 3 */             o0o0IiO0IoOo o0o0iio0iooo = this.zza.I00ll1;
/* 5 */             if (o0o0iio0iooo != null) {
/* 13 */                return new Barcode.GeoPoint(o0o0iio0iooo.I00iOIl, o0o0iio0iooo.I00iiI);
                    }
/* 17 */            return null;
                }

                @Override
                public final Barcode.Phone getPhone() {
/* 3 */             o0o0oIo0 o0o0oio0 = this.zza.I00ioIO;
/* 5 */             if (o0o0oio0 != null) {
/* 13 */                return new Barcode.Phone(o0o0oio0.I00iiI, o0o0oio0.I00iOIl);
                    }
/* 17 */            return null;
                }

                @Override
                public final byte[] getRawBytes() {
/* 3 */             return this.zza.I00iio;
                }

                @Override
                public final String getRawValue() {
/* 3 */             return this.zza.I00iiO;
                }

                @Override
                public final Barcode.Sms getSms() {
/* 3 */             o0o1O00 o0o1o00 = this.zza.I00l0I0l0lO1;
/* 5 */             if (o0o1o00 != null) {
/* 13 */                return new Barcode.Sms(o0o1o00.I00iOIl, o0o1o00.I00iiI);
                    }
/* 17 */            return null;
                }

                @Override
                public final Barcode.UrlBookmark getUrl() {
/* 3 */             o0o1o1IOI0 o0o1o1ioi0 = this.zza.I00li1OI;
/* 5 */             if (o0o1o1ioi0 != null) {
/* 13 */                return new Barcode.UrlBookmark(o0o1o1ioi0.I00iOIl, o0o1o1ioi0.I00iiI);
                    }
/* 17 */            return null;
                }

                @Override
                public final int getValueType() {
/* 3 */             return this.zza.I00ilO0;
                }

                @Override
                public final Barcode.WiFi getWifi() {
/* 3 */             o0oIoIIiiIo o0oioiiiiio = this.zza.I00l0OO0IO;
/* 5 */             if (o0oioiiiiio != null) {
/* 15 */                return new Barcode.WiFi(o0oioiiiiio.I00iOIl, o0oioiiiiio.I00iiI, o0oioiiiiio.I00iiO);
                    }
/* 19 */            return null;
                }
            }
