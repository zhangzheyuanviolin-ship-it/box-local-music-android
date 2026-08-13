            package p000;

            import android.content.ContentValues;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
/* 18 */    public final class l0l1ol11 extends liOO10o0 implements iIiiI0oi {
                public I1Io0i0II I00iio;
                public I1Io0i0II I00ilI0I1;
                public I1Io0i0II I00ilO0;
                public I1Io0i0II I00io1l;
                public I1Io0i0II I00ioIO;
                public I1Io0i0II I00l0I0l0lO1;
                public I1Io0i0II I00l0OO0IO;
                public OOllli10 I00li1OI;
                public iii1IIii I00ll1;
                public I1Io0i0II I00lli11;
                public I1Io0i0II I00lll10;
                public I1Io0i0II I00o0iI0io1;

                public static final I1Io0i0II I010oio1OO0(l00O0loO l00o0loo) {
/* 4 */             I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 19 */            for (l01IlIIiiI l01iliiiii : l00o0loo.I001i1lo1io()) {
/* 35 */                i1Io0i0II.put(l01iliiiii.I00111O(), l01iliiiii.I001IIilI0O());
                    }
/* 77 */            return i1Io0i0II;
                }

                public static final l1iioiool I01101IOlO(int i) {
                    int i2 = i - 1;
/* 4 */             if (i2 == 1) {
/* 26 */                return l1iioiool.AD_STORAGE;
                    }
/* 7 */             if (i2 == 2) {
/* 23 */                return l1iioiool.ANALYTICS_STORAGE;
                    }
/* 10 */            if (i2 == 3) {
/* 20 */                return l1iioiool.AD_USER_DATA;
                    }
/* 13 */            if (i2 != 4) {
/* 15 */                return null;
                    }
/* 17 */            return l1iioiool.AD_PERSONALIZATION;
                }

                @Override
                public final String I00OIl(String str, String str2) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 13 */            Map map = (Map) this.I00iio.get(str);
/* 15 */            if (map != null) {
/* 21 */                return (String) map.get(str2);
                    }
/* 24 */            return null;
                }

                public final l1iIoO01 I010ioo(String str, l1iioiool l1iioioolVar) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 7 */             iooOiIloili ioooiiloiliI011iO = I011iO(str);
/* 11 */            if (ioooiiloiliI011iO != null) {
/* 18 */                Iterator it = ioooiiloiliI011iO.I001iOo1i0O().iterator();
                        while (true) {
/* 26 */                    if (!it.hasNext()) {
                                break;
                            }
/* 32 */                    ioiOO11II0O0 ioioo11ii0o0 = (ioiOO11II0O0) it.next();
/* 42 */                    if (I01101IOlO(ioioo11ii0o0.I00111O()) == l1iioioolVar) {
                                int iI001IIilI0O = ioioo11ii0o0.I001IIilI0O() - 1;
/* 51 */                        if (iI001IIilI0O == 1) {
/* 60 */                            return l1iIoO01.GRANTED;
                                }
/* 54 */                        if (iI001IIilI0O == 2) {
/* 57 */                            return l1iIoO01.DENIED;
                                }
                            }
                        }
                    }
/* 63 */            return l1iIoO01.UNINITIALIZED;
                }

                public final boolean I010l10O(String str) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 7 */             iooOiIloili ioooiiloiliI011iO = I011iO(str);
/* 12 */            if (ioooiiloiliI011iO == null) {
/* 11 */                return false;
                    }
/* 27 */            for (ioiOO11II0O0 ioioo11ii0o0 : ioooiiloiliI011iO.I00111O()) {
/* 40 */                if (ioioo11ii0o0.I00111O() == 3 && ioioo11ii0o0.I001IO000() == 3) {
/* 48 */                    return true;
                        }
                    }
/* 11 */            return false;
                }

                public final void I010l1O(String str) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00o0iI0io1;
/* 3 */             I1Io0i0II i1Io0i0II2 = this.I00lll10;
/* 5 */             I1Io0i0II i1Io0i0II3 = this.I00lli11;
/* 7 */             I1Io0i0II i1Io0i0II4 = this.I00iio;
/* 9 */             I010OIo1l();
/* 12 */            I010II();
/* 15 */            lII0I0I000I.I0000O(str);
/* 18 */            I1Io0i0II i1Io0i0II5 = this.I00l0I0l0lO1;
/* 24 */            if (i1Io0i0II5.get(str) == null) {
/* 28 */                iOl1lOo1IO iol1loo1io = this.I00iiI.I00iiO;
/* 30 */                lilOOl0.I00O0o1oo(iol1loo1io);
/* 33 */                Oo1ol1ll oo1ol1llI01OoIoio00O = iol1loo1io.I01OoIoio00O(str);
/* 37 */                if (oo1ol1llI01OoIoio00O != null) {
/* 93 */                    l001olOIO1il l001oloio1il = (l001olOIO1il) I010o0o0oO(str, (byte[]) oo1ol1llI01OoIoio00O.I00iiI).I000OiO();
/* 95 */                    I010l1ol111(str, l001oloio1il);
/* 108 */                   i1Io0i0II4.put(str, I010oio1OO0((l00O0loO) l001oloio1il.I0000oI00()));
/* 117 */                   i1Io0i0II5.put(str, (l00O0loO) l001oloio1il.I0000oI00());
/* 126 */                   I010lI0oi(str, (l00O0loO) l001oloio1il.I0000oI00());
/* 137 */                   i1Io0i0II3.put(str, ((l00O0loO) l001oloio1il.I00iiI).I00II0oii1o());
/* 144 */                   i1Io0i0II2.put(str, (String) oo1ol1llI01OoIoio00O.I00iiO);
/* 151 */                   i1Io0i0II.put(str, (String) oo1ol1llI01OoIoio00O.I00iio);
/* 168 */                   return;
                        }
/* 40 */                i1Io0i0II4.put(str, null);
/* 45 */                this.I00ilO0.put(str, null);
/* 50 */                this.I00ilI0I1.put(str, null);
/* 55 */                this.I00io1l.put(str, null);
/* 60 */                this.I00ioIO.put(str, null);
/* 63 */                i1Io0i0II5.put(str, null);
/* 66 */                i1Io0i0II3.put(str, null);
/* 69 */                i1Io0i0II2.put(str, null);
/* 72 */                i1Io0i0II.put(str, null);
/* 77 */                this.I00l0OO0IO.put(str, null);
                    }
                }

                public final void I010l1ol111(String str, l001olOIO1il l001oloio1il) {
                    ArrayList arrayList;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            ArrayList arrayList2 = new ArrayList();
/* 19 */            int i = 0;
/* 20 */            I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 25 */            I1Io0i0II i1Io0i0II2 = new I1Io0i0II(0);
/* 30 */            I1Io0i0II i1Io0i0II3 = new I1Io0i0II(0);
/* 45 */            Iterator it = Collections.unmodifiableList(((l00O0loO) l001oloio1il.I00iiI).I00II0Ol1O0l()).iterator();
/* 53 */            while (it.hasNext()) {
/* 65 */                hashSet.add(((ioollI0011i) it.next()).I00111O());
                    }
/* 71 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 73 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 75 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 77 */            iol01I0001 iol01i0001 = iol1II1ii1i.I010iIIOlo;
/* 84 */            if (iil1iil.I01101IOlO(null, iol01i0001)) {
/* 98 */                arrayList2.addAll(Collections.unmodifiableList(((l00O0loO) l001oloio1il.I00iiI).I00IlilI0i0i()));
                    }
/* 109 */           while (i < ((l00O0loO) l001oloio1il.I00iiI).I001iOo1i0O()) {
/* 123 */               ioooil1oIOO ioooil1oioo = (ioooil1oIOO) ((l00O0loO) l001oloio1il.I00iiI).I001l0I00(i).I000OiO();
/* 133 */               if (ioooil1oioo.I000O01llI0().isEmpty()) {
/* 135 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 142 */                   l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("EventConfig contained null event name");
/* 145 */                   arrayList = arrayList2;
                        } else {
/* 149 */                   String strI000O01llI0 = ioooil1oioo.I000O01llI0();
/* 159 */                   arrayList = arrayList2;
/* 163 */                   String strI00000oOI = ll0i0l0Ili.I00000oOI(ioooil1oioo.I000O01llI0(), iO1l1II0O0.I00000oIO, iO1l1II0O0.I0001Ioi1lo);
/* 171 */                   if (!TextUtils.isEmpty(strI00000oOI)) {
/* 173 */                       ioooil1oioo.I0000Il00O();
/* 180 */                       ((l000oiIIiIiI) ioooil1oioo.I00iiI).I001lIiIIo1O(strI00000oOI);
/* 183 */                       l001oloio1il.I0000Il00O();
/* 196 */                       ((l00O0loO) l001oloio1il.I00iiI).I00IoIO0lI(i, (l000oiIIiIiI) ioooil1oioo.I0000oI00());
                            }
/* 207 */                   if (((l000oiIIiIiI) ioooil1oioo.I00iiI).I001IIilI0O() && ((l000oiIIiIiI) ioooil1oioo.I00iiI).I001IO000()) {
/* 221 */                       i1Io0i0II.put(strI000O01llI0, Boolean.TRUE);
                            }
/* 232 */                   if (((l000oiIIiIiI) ioooil1oioo.I00iiI).I001i1O0Ol() && ((l000oiIIiIiI) ioooil1oioo.I00iiI).I001i1lo1io()) {
/* 250 */                       i1Io0i0II2.put(ioooil1oioo.I000O01llI0(), Boolean.TRUE);
                            }
/* 261 */                   if (((l000oiIIiIiI) ioooil1oioo.I00iiI).I001iOo1i0O()) {
/* 272 */                       if (((l000oiIIiIiI) ioooil1oioo.I00iiI).I001l0I00() < 2 || ((l000oiIIiIiI) ioooil1oioo.I00iiI).I001l0I00() > 65535) {
/* 308 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 331 */                           l01o0io1ooo0.I00l0I0l0lO1.I0000O(ioooil1oioo.I000O01llI0(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((l000oiIIiIiI) ioooil1oioo.I00iiI).I001l0I00()));
                                } else {
/* 304 */                           i1Io0i0II3.put(ioooil1oioo.I000O01llI0(), Integer.valueOf(((l000oiIIiIiI) ioooil1oioo.I00iiI).I001l0I00()));
                                }
                            }
                        }
/* 334 */               i++;
/* 336 */               arrayList2 = arrayList;
                    }
/* 341 */           ArrayList arrayList3 = arrayList2;
/* 345 */           this.I00ilI0I1.put(str, hashSet);
/* 355 */           if (l0olllo1i.I00iio.I01101IOlO(null, iol01i0001)) {
/* 361 */               this.I00ioIO.put(str, arrayList3);
                    }
/* 366 */           this.I00ilO0.put(str, i1Io0i0II);
/* 371 */           this.I00io1l.put(str, i1Io0i0II2);
/* 376 */           this.I00l0OO0IO.put(str, i1Io0i0II3);
                }

                public final void I010lI0oi(String str, l00O0loO l00o0loo) {
/* 1 */             OOllli10 oOllli10 = this.I00li1OI;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 11 */            if (l00o0loo.I001lloI() == 0) {
/* 205 */               oOllli10.I0000oI00(str);
/* 332 */               return;
                    }
/* 13 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 15 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 30 */            l01o0io1ooo0.I00lll10.I0000Il00O("EES programs found", Integer.valueOf(l00o0loo.I001lloI()));
/* 37 */            int i = 0;
/* 42 */            l1OOIIoo0 l1ooiioo0 = (l1OOIIoo0) l00o0loo.I001lllioOl().get(0);
                    try {
/* 46 */                iil1iIlO iil1iilo = new iil1iIlO();
/* 49 */                o01l1ioOo0 o01l1iooo0 = iil1iilo.I00000oIO;
/* 56 */                l0il00l0iI l0il00l0ii = new l0il00l0iI(2);
/* 59 */                l0il00l0ii.I00000oOI = this;
/* 61 */                l0il00l0ii.I0000Il00O = str;
/* 63 */                VarHandle.storeStoreFence();
/* 74 */                ((HashMap) ((i1Il01) o01l1iooo0.I00iio).I00iiI).put("internal.remoteConfig", l0il00l0ii);
/* 81 */                l0il00l0iI l0il00l0ii2 = new l0il00l0iI(i);
/* 84 */                l0il00l0ii2.I00000oOI = this;
/* 86 */                l0il00l0ii2.I0000Il00O = str;
/* 88 */                VarHandle.storeStoreFence();
/* 99 */                ((HashMap) ((i1Il01) o01l1iooo0.I00iio).I00iiI).put("internal.appMetadata", l0il00l0ii2);
/* 107 */               Io11llo0i io11llo0i = new Io11llo0i(6);
/* 110 */               io11llo0i.I00000oOI = this;
/* 112 */               VarHandle.storeStoreFence();
/* 123 */               ((HashMap) ((i1Il01) o01l1iooo0.I00iio).I00iiI).put("internal.logger", io11llo0i);
/* 126 */               iil1iilo.I00000oOI(l1ooiioo0);
/* 129 */               oOllli10.I0000O(str, iil1iilo);
/* 132 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 135 */               IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lll10;
/* 151 */               iOloiOI1.I0000O(str, "EES program loaded for appId, activities", Integer.valueOf(l1ooiioo0.I001IIilI0O().I001IIilI0O()));
/* 170 */               for (l1IolOll l1iololl : l1ooiioo0.I001IIilI0O().I00111O()) {
/* 178 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 187 */                   iOloiOI1.I0000Il00O("EES program activity", l1iololl.I00111O());
                        }
                    } catch (il1I0oiIi0o unused) {
/* 192 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 194 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 201 */               l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to load EES program. appId", str);
                    }
                }

                public final l00O0loO I010o0o0oO(String str, byte[] bArr) {
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             if (bArr == null) {
/* 9 */                 return l00O0loO.I00Io1o110i();
                    }
                    try {
/* 28 */                l00O0loO l00o0loo = (l00O0loO) ((l001olOIO1il) lio010i.I01IlIoOI(l00O0loO.I00Io1lO(), bArr)).I0000oI00();
/* 30 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 32 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 70 */                l01o0io1ooo0.I00lll10.I0000O(l00o0loo.I00111O() ? Long.valueOf(l00o0loo.I001IIilI0O()) : null, "Parsed config. version, gmp_app_id", l00o0loo.I001IO000() ? l00o0loo.I001i1O0Ol() : null);
/* 73 */                return l00o0loo;
                    } catch (iI00lI e) {
/* 93 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 95 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 104 */               l01o0io1ooo02.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str), "Unable to merge remote config. appId", e);
/* 107 */               return l00O0loO.I00Io1o110i();
                    } catch (RuntimeException e2) {
/* 74 */                l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 76 */                l0olllO1i.I000II(l01o0io1ooo03);
/* 85 */                l01o0io1ooo03.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str), "Unable to merge remote config. appId", e2);
/* 88 */                return l00O0loO.I00Io1o110i();
                    }
                }

                public final l00O0loO I01101olii(String str) {
/* 1 */             I010OIo1l();
/* 4 */             I010II();
/* 7 */             lII0I0I000I.I0000O(str);
/* 10 */            I010l1O(str);
/* 19 */            return (l00O0loO) this.I00l0I0l0lO1.get(str);
                }

                public final String I0110OiO(String str) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 13 */            return (String) this.I00lli11.get(str);
                }

                /* JADX WARN: Code restructure failed: missing block: B:100:0x0400, code lost:
                
                    r1 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0401, code lost:
                
                    r7.put("filter_id", r1);
                    r27 = r0;
                    r7.put("property_name", r5.I001IO000());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x0413, code lost:
                
                    if (r5.I001l0I00() == false) goto L104;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x0415, code lost:
                
                    r0 = java.lang.Boolean.valueOf(r5.I001lIiIIo1O());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x041e, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x041f, code lost:
                
                    r7.put("session_scoped", r0);
                    r7.put("data", r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x0431, code lost:
                
                    if (r8.I01Io11IiiiO().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L112;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x0433, code lost:
                
                    r0 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r0);
                    r0.I00ilO0.I0000Il00O("Failed to insert property filter (got -1). appId", p000.l01O0IO1ooO0.I010ioo(r29));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:110:0x0444, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x0446, code lost:
                
                    r1 = r23;
                    r0 = r27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x044c, code lost:
                
                    r1 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r1);
                    r1.I00ilO0.I0000O(p000.l01O0IO1ooO0.I010ioo(r29), "Error storing property filter. appId", r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:114:0x045c, code lost:
                
                    r8.I010OIo1l();
                    r8.I010II();
                    p000.lII0I0I000I.I0000O(r29);
                    r0 = r8.I01Io11IiiiO();
                    r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
                    r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:115:0x047f, code lost:
                
                    r1 = r24;
                    r3 = r25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:158:0x061c, code lost:
                
                    r24.endTransaction();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:159:0x061f, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0260, code lost:
                
                    r6 = r0.I001IO000().iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x026c, code lost:
                
                    if (r6.hasNext() == false) goto L192;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0278, code lost:
                
                    if (((p000.ioOIO1il0i) r6.next()).I00111O() != false) goto L200;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x027a, code lost:
                
                    r0 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r0);
                    r0.I00l0I0l0lO1.I0000O(p000.l01O0IO1ooO0.I010ioo(r29), "Property filter with no ID. Audience definition ignored. appId, audienceId", java.lang.Integer.valueOf(r5));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0290, code lost:
                
                    r6 = r0.I001iOo1i0O().iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x029c, code lost:
                
                    r23 = r0;
                    r0 = "audience_id";
                    r24 = r1;
                    r1 = "app_id";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x02ac, code lost:
                
                    if (r6.hasNext() == false) goto L201;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x02ae, code lost:
                
                    r7 = (p000.ioI0OO10) r6.next();
                    r8.I010OIo1l();
                    r8.I010II();
                    p000.lII0I0I000I.I0000O(r29);
                    p000.lII0I0I000I.I000II(r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x02c8, code lost:
                
                    if (r7.I001IO000().isEmpty() == false) goto L70;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x02ca, code lost:
                
                    r0 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r0);
                    r0 = r0.I00l0I0l0lO1;
                    r4 = p000.l01O0IO1ooO0.I010ioo(r29);
                    r6 = java.lang.Integer.valueOf(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x02df, code lost:
                
                    if (r7.I00111O() == false) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x02e1, code lost:
                
                    r21 = java.lang.Integer.valueOf(r7.I001IIilI0O());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x02ec, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x02ef, code lost:
                
                    r21 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x02f1, code lost:
                
                    r0.I0000oI00("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
                    r25 = r3;
                    r26 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x02fe, code lost:
                
                    r25 = r3;
                    r3 = r7.I00000oIO();
                    r26 = r5;
                    r5 = new android.content.ContentValues();
                    r5.put("app_id", r29);
                    r5.put("audience_id", java.lang.Integer.valueOf(r26));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0319, code lost:
                
                    if (r7.I00111O() == false) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x031b, code lost:
                
                    r0 = java.lang.Integer.valueOf(r7.I001IIilI0O());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0324, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0325, code lost:
                
                    r5.put("filter_id", r0);
                    r5.put("event_name", r7.I001IO000());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x0335, code lost:
                
                    if (r7.I00II0Ol1O0l() == false) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x0337, code lost:
                
                    r0 = java.lang.Boolean.valueOf(r7.I00II0oii1o());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x0340, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x0341, code lost:
                
                    r5.put("session_scoped", r0);
                    r5.put("data", r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x0353, code lost:
                
                    if (r8.I01Io11IiiiO().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L203;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x0355, code lost:
                
                    r0 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r0);
                    r0.I00ilO0.I0000Il00O("Failed to insert event filter (got -1). appId", p000.l01O0IO1ooO0.I010ioo(r29));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x0366, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x0368, code lost:
                
                    r0 = r23;
                    r1 = r24;
                    r3 = r25;
                    r5 = r26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x0372, code lost:
                
                    r1 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r1);
                    r1.I00ilO0.I0000O(p000.l01O0IO1ooO0.I010ioo(r29), "Error storing event filter. appId", r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x0384, code lost:
                
                    r25 = r3;
                    r26 = r5;
                    r3 = r23.I001IO000().iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0394, code lost:
                
                    if (r3.hasNext() == false) goto L206;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x0396, code lost:
                
                    r5 = (p000.ioOIO1il0i) r3.next();
                    r8.I010OIo1l();
                    r8.I010II();
                    p000.lII0I0I000I.I0000O(r29);
                    p000.lII0I0I000I.I000II(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x03b0, code lost:
                
                    if (r5.I001IO000().isEmpty() == false) goto L97;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x03b2, code lost:
                
                    r0 = r13.I00ilO0;
                    p000.l0olllO1i.I000II(r0);
                    r0 = r0.I00l0I0l0lO1;
                    r3 = p000.l01O0IO1ooO0.I010ioo(r29);
                    r4 = java.lang.Integer.valueOf(r26);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x03c7, code lost:
                
                    if (r5.I00111O() == false) goto L95;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x03c9, code lost:
                
                    r5 = java.lang.Integer.valueOf(r5.I001IIilI0O());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x03d2, code lost:
                
                    r5 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x03d3, code lost:
                
                    r0.I0000oI00("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x03dc, code lost:
                
                    r6 = r5.I00000oIO();
                    r7 = new android.content.ContentValues();
                    r7.put(r1, r29);
                    r23 = r1;
                    r7.put(r0, java.lang.Integer.valueOf(r26));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x03f5, code lost:
                
                    if (r5.I00111O() == false) goto L100;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x03f7, code lost:
                
                    r1 = java.lang.Integer.valueOf(r5.I001IIilI0O());
                 */
                /* JADX WARN: Removed duplicated region for block: B:152:0x05e4 A[Catch: SQLiteException -> 0x05f5, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x05f5, blocks: (B:150:0x05cd, B:152:0x05e4), top: B:170:0x05cd }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0110o(String str, byte[] bArr, String str2, String str3) throws Throwable {
                    SQLiteDatabase sQLiteDatabase;
                    l001olOIO1il l001oloio1il;
                    byte[] bArrI00000oIO;
                    iOl1lOo1IO iol1loo1io;
                    ContentValues contentValues;
                    boolean z;
/* 9 */             I010OIo1l();
/* 12 */            I010II();
/* 15 */            lII0I0I000I.I0000O(str);
/* 27 */            l001olOIO1il l001oloio1il2 = (l001olOIO1il) I010o0o0oO(str, bArr).I000OiO();
/* 29 */            I010l1ol111(str, l001oloio1il2);
/* 38 */            I010lI0oi(str, (l00O0loO) l001oloio1il2.I0000oI00());
/* 45 */            l00O0loO l00o0loo = (l00O0loO) l001oloio1il2.I0000oI00();
/* 47 */            I1Io0i0II i1Io0i0II = this.I00l0I0l0lO1;
/* 49 */            i1Io0i0II.put(str, l00o0loo);
/* 62 */            this.I00lli11.put(str, ((l00O0loO) l001oloio1il2.I00iiI).I00II0oii1o());
/* 67 */            this.I00lll10.put(str, str2);
/* 72 */            this.I00o0iI0io1.put(str, str3);
/* 87 */            this.I00iio.put(str, I010oio1OO0((l00O0loO) l001oloio1il2.I0000oI00()));
/* 90 */            lilOOl0 lilool0 = this.I00iiI;
/* 92 */            iOl1lOo1IO iol1loo1io2 = lilool0.I00iiO;
/* 94 */            lilOOl0.I00O0o1oo(iol1loo1io2);
/* 111 */           ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((l00O0loO) l001oloio1il2.I00iiI).I001lIiIIo1O()));
/* 124 */           l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io2.I00iOIl;
/* 126 */           int i = 0;
/* 131 */           while (i < arrayList.size()) {
/* 143 */               io1Ol11oOoi io1ol11oooi = (io1Ol11oOoi) ((io1l111o) arrayList.get(i)).I000OiO();
/* 145 */               I1Io0i0II i1Io0i0II2 = i1Io0i0II;
/* 155 */               if (((io1l111o) io1ol11oooi.I00iiI).I001l0I00() != 0) {
/* 157 */                   int i2 = 0;
/* 166 */                   while (i2 < ((io1l111o) io1ol11oooi.I00iiI).I001l0I00()) {
/* 180 */                       io1o11llO io1o11llo = (io1o11llO) ((io1l111o) io1ol11oooi.I00iiI).I001lIiIIo1O(i2).I000OiO();
/* 188 */                       io1o11llO io1o11llo2 = (io1o11llO) io1o11llo.clone();
/* 190 */                       lilOOl0 lilool02 = lilool0;
/* 202 */                       l001olOIO1il l001oloio1il3 = l001oloio1il2;
/* 206 */                       String strI00000oOI = ll0i0l0Ili.I00000oOI(((ioI0OO10) io1o11llo.I00iiI).I001IO000(), iO1l1II0O0.I00000oIO, iO1l1II0O0.I0001Ioi1lo);
/* 210 */                       if (strI00000oOI != null) {
/* 212 */                           io1o11llo2.I0000Il00O();
/* 219 */                           ((ioI0OO10) io1o11llo2.I00iiI).I00IO1oi11O(strI00000oOI);
/* 222 */                           z = true;
                                } else {
/* 224 */                           z = false;
                                }
/* 225 */                       int i3 = 0;
/* 234 */                       while (i3 < ((ioI0OO10) io1o11llo.I00iiI).I001i1lo1io()) {
/* 240 */                           ioIO1Io0o ioio1io0oI001iOo1i0O = ((ioI0OO10) io1o11llo.I00iiI).I001iOo1i0O(i3);
/* 244 */                           boolean z2 = z;
/* 250 */                           io1o11llO io1o11llo3 = io1o11llo;
/* 258 */                           String strI00000oOI2 = ll0i0l0Ili.I00000oOI(ioio1io0oI001iOo1i0O.I001lIiIIo1O(), iO1l1oi.I00000oIO, iO1l1oi.I00000oOI);
/* 262 */                           if (strI00000oOI2 != null) {
/* 268 */                               ioII0loiioI ioii0loiioi = (ioII0loiioI) ioio1io0oI001iOo1i0O.I000OiO();
/* 270 */                               ioii0loiioi.I0000Il00O();
/* 277 */                               ((ioIO1Io0o) ioii0loiioi.I00iiI).I001lloI(strI00000oOI2);
/* 284 */                               ioIO1Io0o ioio1io0o = (ioIO1Io0o) ioii0loiioi.I0000oI00();
/* 286 */                               io1o11llo2.I0000Il00O();
/* 293 */                               ((ioI0OO10) io1o11llo2.I00iiI).I00IOO(i3, ioio1io0o);
/* 296 */                               z = true;
                                    } else {
/* 298 */                               z = z2;
                                    }
/* 300 */                           i3++;
/* 302 */                           io1o11llo = io1o11llo3;
                                }
/* 307 */                       if (z) {
/* 309 */                           io1ol11oooi.I0000Il00O();
/* 322 */                           ((io1l111o) io1ol11oooi.I00iiI).I001lloI(i2, (ioI0OO10) io1o11llo2.I0000oI00());
/* 331 */                           arrayList.set(i, (io1l111o) io1ol11oooi.I0000oI00());
                                }
/* 334 */                       i2++;
/* 340 */                       lilool0 = lilool02;
/* 342 */                       l001oloio1il2 = l001oloio1il3;
                            }
                        }
/* 346 */               l001olOIO1il l001oloio1il4 = l001oloio1il2;
/* 348 */               lilOOl0 lilool03 = lilool0;
/* 358 */               if (((io1l111o) io1ol11oooi.I00iiI).I001i1O0Ol() != 0) {
/* 369 */                   for (int i4 = 0; i4 < ((io1l111o) io1ol11oooi.I00iiI).I001i1O0Ol(); i4++) {
/* 375 */                       ioOIO1il0i iooio1il0iI001i1lo1io = ((io1l111o) io1ol11oooi.I00iiI).I001i1lo1io(i4);
/* 387 */                       String strI00000oOI3 = ll0i0l0Ili.I00000oOI(iooio1il0iI001i1lo1io.I001IO000(), iO1lI0lo110.I00000oIO, iO1lI0lo110.I00000oOI);
/* 391 */                       if (strI00000oOI3 != null) {
/* 397 */                           ioO0iOoIi ioo0iooii = (ioO0iOoIi) iooio1il0iI001i1lo1io.I000OiO();
/* 399 */                           ioo0iooii.I0000Il00O();
/* 406 */                           ((ioOIO1il0i) ioo0iooii.I00iiI).I001lloI(strI00000oOI3);
/* 409 */                           io1ol11oooi.I0000Il00O();
/* 422 */                           ((io1l111o) io1ol11oooi.I00iiI).I001lllioOl(i4, (ioOIO1il0i) ioo0iooii.I0000oI00());
/* 431 */                           arrayList.set(i, (io1l111o) io1ol11oooi.I0000oI00());
                                }
                            }
                        }
/* 437 */               i++;
/* 445 */               i1Io0i0II = i1Io0i0II2;
/* 447 */               lilool0 = lilool03;
/* 449 */               l001oloio1il2 = l001oloio1il4;
                    }
/* 453 */           l001olOIO1il l001oloio1il5 = l001oloio1il2;
/* 455 */           I1Io0i0II i1Io0i0II3 = i1Io0i0II;
/* 457 */           lilOOl0 lilool04 = lilool0;
/* 459 */           iol1loo1io2.I010OIo1l();
/* 462 */           iol1loo1io2.I010II();
/* 465 */           lII0I0I000I.I0000O(str);
/* 468 */           SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = iol1loo1io2.I01Io11IiiiO();
/* 472 */           sQLiteDatabaseI01Io11IiiiO.beginTransaction();
                    try {
/* 475 */               iol1loo1io2.I010OIo1l();
/* 478 */               iol1loo1io2.I010II();
/* 481 */               lII0I0I000I.I0000O(str);
/* 484 */               SQLiteDatabase sQLiteDatabaseI01Io11IiiiO2 = iol1loo1io2.I01Io11IiiiO();
/* 492 */               sQLiteDatabaseI01Io11IiiiO2.delete("property_filters", "app_id=?", new String[]{str});
/* 499 */               sQLiteDatabaseI01Io11IiiiO2.delete("event_filters", "app_id=?", new String[]{str});
/* 502 */               Iterator it = arrayList.iterator();
/* 510 */               while (it.hasNext()) {
/* 516 */                   io1l111o io1l111oVar = (io1l111o) it.next();
/* 518 */                   iol1loo1io2.I010OIo1l();
/* 521 */                   iol1loo1io2.I010II();
/* 524 */                   lII0I0I000I.I0000O(str);
/* 527 */                   lII0I0I000I.I000II(io1l111oVar);
/* 534 */                   if (io1l111oVar.I00111O()) {
/* 558 */                       int iI001IIilI0O = io1l111oVar.I001IIilI0O();
/* 566 */                       Iterator it2 = io1l111oVar.I001iOo1i0O().iterator();
                                while (true) {
/* 574 */                           if (!it2.hasNext()) {
                                        break;
                                    }
/* 586 */                           if (!((ioI0OO10) it2.next()).I00111O()) {
/* 588 */                               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 590 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 605 */                               l01o0io1ooo0.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iI001IIilI0O));
                                        break;
                                    }
                                }
                            } else {
/* 536 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 538 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 549 */                       l01o0io1ooo02.I00l0I0l0lO1.I0000Il00O("Audience with no ID. appId", l01O0IO1ooO0.I010ioo(str));
                            }
                        }
/* 1158 */              sQLiteDatabase = sQLiteDatabaseI01Io11IiiiO;
/* 1163 */              ArrayList arrayList2 = new ArrayList();
/* 1166 */              Iterator it3 = arrayList.iterator();
/* 1174 */              while (it3.hasNext()) {
/* 1180 */                  io1l111o io1l111oVar2 = (io1l111o) it3.next();
/* 1198 */                  arrayList2.add(io1l111oVar2.I00111O() ? Integer.valueOf(io1l111oVar2.I001IIilI0O()) : null);
                        }
/* 1210 */              lII0I0I000I.I0000O(str);
/* 1213 */              iol1loo1io2.I010OIo1l();
/* 1216 */              iol1loo1io2.I010II();
/* 1219 */              SQLiteDatabase sQLiteDatabaseI01Io11IiiiO3 = iol1loo1io2.I01Io11IiiiO();
                        try {
/* 1229 */                  long jI011iO = iol1loo1io2.I011iO("select count(1) from audience_filter_values where app_id=?", new String[]{str});
/* 1248 */                  int iMax = Math.max(0, Math.min(2000, l0olllo1i.I00iio.I010o0o0oO(str, iol1II1ii1i.I00OIO1)));
/* 1255 */                  if (jI011iO > iMax) {
/* 1261 */                      ArrayList arrayList3 = new ArrayList();
/* 1264 */                      int i5 = 0;
                                while (true) {
/* 1269 */                          if (i5 >= arrayList2.size()) {
/* 1295 */                              String strJoin = TextUtils.join(",", arrayList3);
/* 1311 */                              StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
/* 1314 */                              sb.append("(");
/* 1317 */                              sb.append(strJoin);
/* 1320 */                              sb.append(")");
/* 1323 */                              String string = sb.toString();
/* 1337 */                              StringBuilder sb2 = new StringBuilder(string.length() + 140);
/* 1340 */                              sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
/* 1343 */                              sb2.append(string);
/* 1346 */                              sb2.append(" order by rowid desc limit -1 offset ?)");
/* 1361 */                              sQLiteDatabaseI01Io11IiiiO3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                                        break;
                                    }
/* 1275 */                          Integer num = (Integer) arrayList2.get(i5);
/* 1277 */                          if (num == null) {
                                        break;
                                    }
/* 1287 */                          arrayList3.add(Integer.toString(num.intValue()));
/* 1290 */                          i5++;
                                }
                            }
                        } catch (SQLiteException e) {
/* 1366 */                  l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 1368 */                  l0olllO1i.I000II(l01o0io1ooo03);
/* 1379 */                  l01o0io1ooo03.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Database error querying filters. appId", e);
                        }
/* 1382 */              sQLiteDatabase.setTransactionSuccessful();
/* 1385 */              sQLiteDatabase.endTransaction();
                        try {
/* 1388 */                  l001oloio1il5.I0000Il00O();
/* 1391 */                  l001oloio1il = l001oloio1il5;
                        } catch (RuntimeException e2) {
/* 1417 */                  e = e2;
/* 1418 */                  l001oloio1il = l001oloio1il5;
                        }
                        try {
/* 1397 */                  ((l00O0loO) l001oloio1il.I00iiI).I00IoO0();
/* 1406 */                  bArrI00000oIO = ((l00O0loO) l001oloio1il.I0000oI00()).I00000oIO();
                        } catch (RuntimeException e3) {
/* 1413 */                  e = e3;
/* 1425 */                  l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 1427 */                  l0olllO1i.I000II(l01o0io1ooo04);
/* 1438 */                  l01o0io1ooo04.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e);
/* 1441 */                  bArrI00000oIO = bArr;
/* 1444 */                  iol1loo1io = lilool04.I00iiO;
/* 1446 */                  lilOOl0.I00O0o1oo(iol1loo1io);
/* 1451 */                  l0olllO1i l0olllo1i2 = (l0olllO1i) iol1loo1io.I00iOIl;
/* 1453 */                  lII0I0I000I.I0000O(str);
/* 1456 */                  iol1loo1io.I010II();
/* 1459 */                  iol1loo1io.I010OIo1l();
/* 1464 */                  contentValues = new ContentValues();
/* 1469 */                  contentValues.put("remote_config", bArrI00000oIO);
/* 1476 */                  contentValues.put("config_last_modified_time", str2);
/* 1483 */                  contentValues.put("e_tag", str3);
/* 1507 */                  if (iol1loo1io.I01Io11IiiiO().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                            }
/* 1543 */                  l001oloio1il.I0000Il00O();
/* 1550 */                  ((l00O0loO) l001oloio1il.I00iiI).I00IoiI();
/* 1561 */                  i1Io0i0II3.put(str, (l00O0loO) l001oloio1il.I0000oI00());
                        }
/* 1444 */              iol1loo1io = lilool04.I00iiO;
/* 1446 */              lilOOl0.I00O0o1oo(iol1loo1io);
/* 1451 */              l0olllO1i l0olllo1i22 = (l0olllO1i) iol1loo1io.I00iOIl;
/* 1453 */              lII0I0I000I.I0000O(str);
/* 1456 */              iol1loo1io.I010II();
/* 1459 */              iol1loo1io.I010OIo1l();
/* 1464 */              contentValues = new ContentValues();
/* 1469 */              contentValues.put("remote_config", bArrI00000oIO);
/* 1476 */              contentValues.put("config_last_modified_time", str2);
/* 1483 */              contentValues.put("e_tag", str3);
                        try {
/* 1507 */                  if (iol1loo1io.I01Io11IiiiO().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
/* 1509 */                      l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i22.I00ilO0;
/* 1511 */                      l0olllO1i.I000II(l01o0io1ooo05);
/* 1522 */                      l01o0io1ooo05.I00ilO0.I0000Il00O("Failed to update remote config (got 0). appId", l01O0IO1ooO0.I010ioo(str));
                            }
                        } catch (SQLiteException e4) {
/* 1527 */                  l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i22.I00ilO0;
/* 1529 */                  l0olllO1i.I000II(l01o0io1ooo06);
/* 1540 */                  l01o0io1ooo06.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error storing remote config. appId", e4);
                        }
/* 1543 */              l001oloio1il.I0000Il00O();
/* 1550 */              ((l00O0loO) l001oloio1il.I00iiI).I00IoiI();
/* 1561 */              i1Io0i0II3.put(str, (l00O0loO) l001oloio1il.I0000oI00());
                    } catch (Throwable th) {
/* 553 */               th = th;
/* 554 */               sQLiteDatabase = sQLiteDatabaseI01Io11IiiiO;
                    }
                }

                public final boolean I0111i(String str, String str2) {
                    Boolean bool;
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 19 */            if ("1".equals(I00OIl(str, "measurement.upload.blacklist_internal")) && lioil0ilIOi.I01I1Oo0oll(str2)) {
/* 46 */                return true;
                    }
/* 38 */            if ("1".equals(I00OIl(str, "measurement.upload.blacklist_public")) && lioil0ilIOi.I01OOIlI(str2)) {
/* 46 */                return true;
                    }
/* 54 */            Map map = (Map) this.I00ilO0.get(str);
/* 56 */            if (map == null || (bool = (Boolean) map.get(str2)) == null) {
/* 72 */                return false;
                    }
/* 67 */            return bool.booleanValue();
                }

                public final boolean I011IO1I11OI(String str, String str2) {
                    Boolean bool;
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 13 */            if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
/* 59 */                return true;
                    }
/* 39 */            Map map = (Map) this.I00io1l.get(str);
/* 41 */            if (map == null || (bool = (Boolean) map.get(str2)) == null) {
/* 57 */                return false;
                    }
/* 52 */            return bool.booleanValue();
                }

                public final List I011IOil(String str) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 13 */            return (List) this.I00ioIO.get(str);
                }

                public final int I011Ill(String str, String str2) {
                    Integer num;
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 13 */            Map map = (Map) this.I00l0OO0IO.get(str);
/* 15 */            if (map == null || (num = (Integer) map.get(str2)) == null) {
/* 31 */                return 1;
                    }
/* 26 */            return num.intValue();
                }

                public final boolean I011Io0I1ioi(String str) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 7 */             I1Io0i0II i1Io0i0II = this.I00ilI0I1;
/* 13 */            if (i1Io0i0II.get(str) != null) {
                        return ((Set) i1Io0i0II.get(str)).contains("os_version") || ((Set) i1Io0i0II.get(str)).contains("device_info");
                    }
/* 46 */            return false;
                }

                public final boolean I011Ol0(String str) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 7 */             I1Io0i0II i1Io0i0II = this.I00ilI0I1;
                    return i1Io0i0II.get(str) != null && ((Set) i1Io0i0II.get(str)).contains("app_instance_id");
                }

                public final boolean I011iIOio(String str, l1iioiool l1iioioolVar) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 7 */             iooOiIloili ioooiiloiliI011iO = I011iO(str);
/* 11 */            if (ioooiiloiliI011iO == null) {
/* 53 */                return false;
                    }
/* 26 */            for (ioiOO11II0O0 ioioo11ii0o0 : ioooiiloiliI011iO.I00111O()) {
/* 42 */                if (l1iioioolVar == I01101IOlO(ioioo11ii0o0.I00111O())) {
                            return ioioo11ii0o0.I001IIilI0O() == 2;
                        }
                    }
/* 53 */            return false;
                }

                public final iooOiIloili I011iO(String str) {
/* 1 */             I010II();
/* 4 */             I010l1O(str);
/* 7 */             l00O0loO l00o0looI01101olii = I01101olii(str);
/* 11 */            if (l00o0looI01101olii == null || !l00o0looI01101olii.I00IO1()) {
/* 25 */                return null;
                    }
/* 20 */            return l00o0looI01101olii.I00IO1oi11O();
                }

                @Override
/* 19 */        public final void I010iIIOlo() {
                }
            }
