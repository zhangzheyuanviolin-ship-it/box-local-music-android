            package com.google.mlkit.vision.barcode.internal;

            import android.graphics.Point;
            import android.graphics.Rect;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.l0oI0OIiiIio;
            import p000.l1O11O;
            import p000.l1ol1ilIlOo0;
            import p000.lIOloiIol;
            import p000.lO0Ooil;
            import p000.lOi1lo;
            import p000.li0l01iIOo;
            import p000.liiii1looii;
            import p000.ll0oilIOo0o;
            import p000.lli1OIoi11i;
            import p000.lo00o1OOI;
            import p000.loO1OIOlI0O1;
            import p000.loliloil;
            
            public final class zzp implements BarcodeSource {
                private final loliloil zza;

                public zzp(loliloil loliloilVar) {
/* 4 */             this.zza = loliloilVar;
                }

                private static Barcode.CalendarDateTime zza(l1O11O l1o11o) {
/* 1 */             if (l1o11o == null) {
/* 3 */                 return null;
                    }
/* 23 */            return new Barcode.CalendarDateTime(l1o11o.I00iOIl, l1o11o.I00iiI, l1o11o.I00iiO, l1o11o.I00iio, l1o11o.I00ilI0I1, l1o11o.I00ilO0, l1o11o.I00io1l, l1o11o.I00ioIO);
                }

                @Override
                public final Rect getBoundingBox() {
/* 1 */             loliloil loliloilVar = this.zza;
/* 5 */             if (loliloilVar.I00ilI0I1 == null) {
/* 56 */                return null;
                    }
/* 7 */             int i = 0;
/* 8 */             int iMax = Integer.MIN_VALUE;
/* 13 */            int iMin = Integer.MAX_VALUE;
/* 14 */            int iMin2 = Integer.MAX_VALUE;
/* 15 */            int iMax2 = Integer.MIN_VALUE;
                    while (true) {
/* 16 */                Point[] pointArr = loliloilVar.I00ilI0I1;
/* 19 */                if (i >= pointArr.length) {
/* 52 */                    return new Rect(iMin, iMin2, iMax, iMax2);
                        }
/* 21 */                Point point = pointArr[i];
/* 25 */                iMin = Math.min(iMin, point.x);
/* 31 */                iMax = Math.max(iMax, point.x);
/* 37 */                iMin2 = Math.min(iMin2, point.y);
/* 43 */                iMax2 = Math.max(iMax2, point.y);
/* 47 */                i++;
                    }
                }

                @Override
                public final Barcode.CalendarEvent getCalendarEvent() {
/* 3 */             l1ol1ilIlOo0 l1ol1ililoo0 = this.zza.I00ll1;
/* 5 */             if (l1ol1ililoo0 == null) {
/* 7 */                 return null;
                    }
/* 33 */            return new Barcode.CalendarEvent(l1ol1ililoo0.I00iOIl, l1ol1ililoo0.I00iiI, l1ol1ililoo0.I00iiO, l1ol1ililoo0.I00iio, l1ol1ililoo0.I00ilI0I1, zza(l1ol1ililoo0.I00ilO0), zza(l1ol1ililoo0.I00io1l));
                }

                @Override
                public final Barcode.ContactInfo getContactInfo() {
/* 3 */             lIOloiIol lioloiiol = this.zza.I00lli11;
/* 6 */             if (lioloiiol == null) {
/* 5 */                 return null;
                    }
/* 11 */            liiii1looii liiii1looiiVar = lioloiiol.I00iOIl;
/* 33 */            Barcode.PersonName personName = liiii1looiiVar == null ? null : new Barcode.PersonName(liiii1looiiVar.I00iOIl, liiii1looiiVar.I00iiI, liiii1looiiVar.I00iiO, liiii1looiiVar.I00iio, liiii1looiiVar.I00ilI0I1, liiii1looiiVar.I00ilO0, liiii1looiiVar.I00io1l);
/* 37 */            String str = lioloiiol.I00iiI;
/* 39 */            String str2 = lioloiiol.I00iiO;
/* 41 */            ll0oilIOo0o[] ll0oilioo0oArr = lioloiiol.I00iio;
/* 45 */            ArrayList arrayList = new ArrayList();
/* 49 */            if (ll0oilioo0oArr != null) {
/* 53 */                for (ll0oilIOo0o ll0oilioo0o : ll0oilioo0oArr) {
/* 57 */                    if (ll0oilioo0o != null) {
/* 68 */                        arrayList.add(new Barcode.Phone(ll0oilioo0o.I00iiI, ll0oilioo0o.I00iOIl));
                            }
                        }
                    }
/* 74 */            lOi1lo[] loi1loArr = lioloiiol.I00ilI0I1;
/* 79 */            ArrayList arrayList2 = new ArrayList();
/* 82 */            if (loi1loArr != null) {
/* 86 */                for (lOi1lo loi1lo : loi1loArr) {
/* 90 */                    if (loi1lo != null) {
/* 105 */                       arrayList2.add(new Barcode.Email(loi1lo.I00iOIl, loi1lo.I00iiI, loi1lo.I00iiO, loi1lo.I00iio));
                            }
                        }
                    }
/* 111 */           String[] strArr = lioloiiol.I00ilO0;
/* 122 */           List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
/* 125 */           l0oI0OIiiIio[] l0oi0oiiiiioArr = lioloiiol.I00io1l;
/* 129 */           ArrayList arrayList3 = new ArrayList();
                    if (l0oi0oiiiiioArr != null) {
/* 135 */               for (l0oI0OIiiIio l0oi0oiiiiio : l0oi0oiiiiioArr) {
/* 139 */                   if (l0oi0oiiiiio != null) {
/* 150 */                       arrayList3.add(new Barcode.Address(l0oi0oiiiiio.I00iOIl, l0oi0oiiiiio.I00iiI));
                            }
                        }
                    }
/* 157 */           return new Barcode.ContactInfo(personName, str, str2, arrayList, arrayList2, listAsList, arrayList3);
                }

                @Override
                public final Point[] getCornerPoints() {
/* 3 */             return this.zza.I00ilI0I1;
                }

                @Override
                public final String getDisplayValue() {
/* 3 */             return this.zza.I00iiO;
                }

                @Override
                public final Barcode.DriverLicense getDriverLicense() {
/* 3 */             lO0Ooil lo0ooil = this.zza.I00lll10;
/* 5 */             if (lo0ooil == null) {
/* 7 */                 return null;
                    }
/* 39 */            return new Barcode.DriverLicense(lo0ooil.I00iOIl, lo0ooil.I00iiI, lo0ooil.I00iiO, lo0ooil.I00iio, lo0ooil.I00ilI0I1, lo0ooil.I00ilO0, lo0ooil.I00io1l, lo0ooil.I00ioIO, lo0ooil.I00l0I0l0lO1, lo0ooil.I00l0OO0IO, lo0ooil.I00li1OI, lo0ooil.I00ll1, lo0ooil.I00lli11, lo0ooil.I00lll10);
                }

                @Override
                public final Barcode.Email getEmail() {
/* 3 */             lOi1lo loi1lo = this.zza.I00ilO0;
/* 5 */             if (loi1lo != null) {
/* 17 */                return new Barcode.Email(loi1lo.I00iOIl, loi1lo.I00iiI, loi1lo.I00iiO, loi1lo.I00iio);
                    }
/* 21 */            return null;
                }

                @Override
                public final int getFormat() {
/* 3 */             return this.zza.I00iOIl;
                }

                @Override
                public final Barcode.GeoPoint getGeoPoint() {
/* 3 */             li0l01iIOo li0l01iioo = this.zza.I00li1OI;
/* 5 */             if (li0l01iioo != null) {
/* 13 */                return new Barcode.GeoPoint(li0l01iioo.I00iOIl, li0l01iioo.I00iiI);
                    }
/* 17 */            return null;
                }

                @Override
                public final Barcode.Phone getPhone() {
/* 3 */             ll0oilIOo0o ll0oilioo0o = this.zza.I00io1l;
/* 5 */             if (ll0oilioo0o != null) {
/* 13 */                return new Barcode.Phone(ll0oilioo0o.I00iiI, ll0oilioo0o.I00iOIl);
                    }
/* 17 */            return null;
                }

                @Override
                public final byte[] getRawBytes() {
/* 3 */             return this.zza.I00o0iI0io1;
                }

                @Override
                public final String getRawValue() {
/* 3 */             return this.zza.I00iiI;
                }

                @Override
                public final Barcode.Sms getSms() {
/* 3 */             lli1OIoi11i lli1oioi11i = this.zza.I00ioIO;
/* 5 */             if (lli1oioi11i != null) {
/* 13 */                return new Barcode.Sms(lli1oioi11i.I00iOIl, lli1oioi11i.I00iiI);
                    }
/* 17 */            return null;
                }

                @Override
                public final Barcode.UrlBookmark getUrl() {
/* 3 */             lo00o1OOI lo00o1ooi = this.zza.I00l0OO0IO;
/* 5 */             if (lo00o1ooi != null) {
/* 13 */                return new Barcode.UrlBookmark(lo00o1ooi.I00iOIl, lo00o1ooi.I00iiI);
                    }
/* 17 */            return null;
                }

                @Override
                public final int getValueType() {
/* 3 */             return this.zza.I00iio;
                }

                @Override
                public final Barcode.WiFi getWifi() {
/* 3 */             loO1OIOlI0O1 loo1oioli0o1 = this.zza.I00l0I0l0lO1;
/* 5 */             if (loo1oioli0o1 != null) {
/* 15 */                return new Barcode.WiFi(loo1oioli0o1.I00iOIl, loo1oioli0o1.I00iiI, loo1oioli0o1.I00iiO);
                    }
/* 19 */            return null;
                }
            }
