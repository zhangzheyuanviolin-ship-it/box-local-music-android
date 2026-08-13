            package p000;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.graphics.drawable.Icon;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import androidx.core.graphics.drawable.IconCompat;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class OIO0oiOO {
                public final Context I00000oIO;
                public CharSequence I0000oI00;
                public CharSequence I0001Ioi1lo;
                public PendingIntent I000II;
                public IconCompat I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public I01O1lIi I000l1;
                public int I000lI;
                public int I000o00OoI0I;
                public Bundle I00100l0;
                public String I0010o;
                public final boolean I00111O;
                public final Notification I001IIilI0O;
                public final ArrayList I001IO000;
                public final ArrayList I00000oOI = new ArrayList();
                public final ArrayList I0000Il00O = new ArrayList();
                public final ArrayList I0000O = new ArrayList();
                public boolean I000iOII = true;
                public boolean I000oI1ioi = false;
                public int I00100o1O0lo = 0;
                public int I0010I0i = 0;

                public OIO0oiOO(Context context, String str) {
/* 37 */            Notification notification = new Notification();
/* 40 */            this.I001IIilI0O = notification;
/* 42 */            this.I00000oIO = context;
/* 44 */            this.I0010o = str;
/* 50 */            notification.when = System.currentTimeMillis();
/* 53 */            notification.audioStreamType = -1;
/* 55 */            this.I000OiO = 0;
/* 62 */            this.I001IO000 = new ArrayList();
/* 64 */            this.I00111O = true;
                }

                public static CharSequence I0000Il00O(CharSequence charSequence) {
                    return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
                }

                public final void I00000oIO(int i, PendingIntent pendingIntent, String str) {
/* 7 */             IconCompat iconCompatI00000oIO = i == 0 ? null : IconCompat.I00000oIO(i);
/* 13 */            Bundle bundle = new Bundle();
/* 16 */            OIO0io1l oIO0io1l = new OIO0io1l();
/* 19 */            oIO0io1l.I00000oOI = iconCompatI00000oIO;
/* 21 */            if (iconCompatI00000oIO != null) {
/* 23 */                int type = iconCompatI00000oIO.I00000oIO;
/* 26 */                if (type == -1) {
/* 32 */                    type = ((Icon) iconCompatI00000oIO.I00000oOI).getType();
                        }
/* 37 */                if (type == 2) {
/* 43 */                    oIO0io1l.I0000O = iconCompatI00000oIO.I00000oOI();
                        }
                    }
/* 49 */            oIO0io1l.I0000oI00 = I0000Il00O(str);
/* 51 */            oIO0io1l.I0001Ioi1lo = pendingIntent;
/* 53 */            oIO0io1l.I00000oIO = bundle;
/* 56 */            oIO0io1l.I0000Il00O = true;
/* 58 */            VarHandle.storeStoreFence();
/* 63 */            this.I00000oOI.add(oIO0io1l);
                }

                public final Notification I00000oOI() {
                    Bundle bundle;
                    int i;
                    int i2;
/* 7 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(20);
/* 12 */            Bundle bundle2 = new Bundle();
/* 15 */            olOO1i11110.I00iiO = this;
/* 23 */            Notification.Builder builder = new Notification.Builder(this.I00000oIO, this.I0010o);
/* 26 */            olOO1i11110.I00iiI = builder;
/* 28 */            Notification notification = this.I001IIilI0O;
/* 171 */           builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.I0000oI00).setContentText(this.I0001Ioi1lo).setContentInfo(null).setContentIntent(this.I000II).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & Barcode.FORMAT_ITF) != 0).setNumber(this.I000OOo1O).setProgress(this.I000lI, this.I000o00OoI0I, false);
/* 174 */           IconCompat iconCompat = this.I000O01llI0;
/* 184 */           builder.setLargeIcon(iconCompat == null ? null : io1oI1iOIoOi.I00000oIO(iconCompat));
/* 197 */           builder.setSubText(null).setUsesChronometer(false).setPriority(this.I000OiO);
/* 202 */           Iterator it = this.I00000oOI.iterator();
/* 212 */           while (it.hasNext()) {
/* 218 */               OIO0io1l oIO0io1l = (OIO0io1l) it.next();
/* 220 */               IconCompat iconCompatI00000oIO = oIO0io1l.I00000oOI;
/* 222 */               if (iconCompatI00000oIO == null && (i2 = oIO0io1l.I0000O) != 0) {
/* 228 */                   iconCompatI00000oIO = IconCompat.I00000oIO(i2);
/* 232 */                   oIO0io1l.I00000oOI = iconCompatI00000oIO;
                        }
/* 234 */               boolean z = oIO0io1l.I0000Il00O;
/* 236 */               Bundle bundle3 = oIO0io1l.I00000oIO;
/* 252 */               Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatI00000oIO != null ? io1oI1iOIoOi.I00000oIO(iconCompatI00000oIO) : null, oIO0io1l.I0000oI00, oIO0io1l.I0001Ioi1lo);
/* 265 */               Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
/* 268 */               bundle4.putBoolean("android.support.allowGeneratedReplies", z);
/* 271 */               builder2.setAllowGeneratedReplies(z);
/* 276 */               bundle4.putInt("android.support.action.semanticAction", 0);
/* 279 */               builder2.setSemanticAction(0);
/* 282 */               builder2.setContextual(false);
/* 285 */               builder2.setAuthenticationRequired(false);
/* 292 */               if (Build.VERSION.SDK_INT >= 37) {
/* 294 */                   I0ll01oOo1.I00000oIO(builder2);
/* 297 */                   I0ll01oOo1.I0000Il00O(builder2);
                        }
/* 302 */               bundle4.putBoolean("android.support.action.showsUserInterface", true);
/* 305 */               builder2.addExtras(bundle4);
/* 316 */               ((Notification.Builder) olOO1i11110.I00iiI).addAction(builder2.build());
                    }
/* 320 */           Bundle bundle5 = this.I00100l0;
/* 322 */           if (bundle5 != null) {
/* 324 */               bundle2.putAll(bundle5);
                    }
/* 329 */           builder.setShowWhen(this.I000iOII);
/* 334 */           builder.setLocalOnly(this.I000oI1ioi);
/* 337 */           builder.setGroup(null);
/* 340 */           builder.setSortKey(null);
/* 343 */           builder.setGroupSummary(false);
/* 346 */           builder.setCategory(null);
/* 351 */           builder.setColor(this.I00100o1O0lo);
/* 356 */           builder.setVisibility(this.I0010I0i);
/* 359 */           builder.setPublicVersion(null);
/* 366 */           builder.setSound(notification.sound, notification.audioAttributes);
/* 369 */           ArrayList arrayList = this.I001IO000;
/* 371 */           if (arrayList != null && !arrayList.isEmpty()) {
/* 379 */               Iterator it2 = arrayList.iterator();
/* 387 */               while (it2.hasNext()) {
/* 395 */                   builder.addPerson((String) it2.next());
                        }
                    }
/* 399 */           ArrayList arrayList2 = this.I0000O;
/* 405 */           if (arrayList2.size() > 0) {
/* 407 */               Bundle bundle6 = this.I00100l0;
/* 409 */               if (bundle6 == null) {
/* 413 */                   bundle6 = new Bundle();
/* 416 */                   this.I00100l0 = bundle6;
                        }
/* 420 */               Bundle bundle7 = bundle6.getBundle("android.car.EXTENSIONS");
/* 424 */               if (bundle7 == null) {
/* 428 */                   bundle7 = new Bundle();
                        }
/* 433 */               Bundle bundle8 = new Bundle(bundle7);
/* 438 */               Bundle bundle9 = new Bundle();
/* 441 */               int i3 = 0;
/* 446 */               while (i3 < arrayList2.size()) {
/* 448 */                   String string = Integer.toString(i3);
/* 456 */                   OIO0io1l oIO0io1l2 = (OIO0io1l) arrayList2.get(i3);
/* 460 */                   Bundle bundle10 = new Bundle();
/* 463 */                   IconCompat iconCompatI00000oIO2 = oIO0io1l2.I00000oOI;
/* 465 */                   if (iconCompatI00000oIO2 == null && (i = oIO0io1l2.I0000O) != 0) {
/* 471 */                       iconCompatI00000oIO2 = IconCompat.I00000oIO(i);
/* 475 */                       oIO0io1l2.I00000oOI = iconCompatI00000oIO2;
                            }
/* 477 */                   Bundle bundle11 = oIO0io1l2.I00000oIO;
/* 485 */                   ArrayList arrayList3 = arrayList2;
/* 492 */                   bundle10.putInt("icon", iconCompatI00000oIO2 != null ? iconCompatI00000oIO2.I00000oOI() : 0);
/* 499 */                   bundle10.putCharSequence("title", oIO0io1l2.I0000oI00);
/* 506 */                   bundle10.putParcelable("actionIntent", oIO0io1l2.I0001Ioi1lo);
/* 519 */                   Bundle bundle12 = bundle11 != null ? new Bundle(bundle11) : new Bundle();
/* 524 */                   bundle12.putBoolean("android.support.allowGeneratedReplies", oIO0io1l2.I0000Il00O);
/* 529 */                   bundle10.putBundle("extras", bundle12);
/* 535 */                   bundle10.putParcelableArray("remoteInputs", null);
/* 541 */                   bundle10.putBoolean("showsUserInterface", true);
/* 547 */                   bundle10.putInt("semanticAction", 0);
/* 550 */                   bundle9.putBundle(string, bundle10);
/* 553 */                   i3++;
/* 556 */                   arrayList2 = arrayList3;
                        }
/* 563 */               bundle7.putBundle("invisible_actions", bundle9);
/* 566 */               bundle8.putBundle("invisible_actions", bundle9);
/* 569 */               Bundle bundle13 = this.I00100l0;
/* 571 */               if (bundle13 == null) {
/* 575 */                   bundle13 = new Bundle();
/* 578 */                   this.I00100l0 = bundle13;
                        }
/* 580 */               bundle13.putBundle("android.car.EXTENSIONS", bundle7);
/* 583 */               bundle2.putBundle("android.car.EXTENSIONS", bundle8);
                    }
/* 588 */           builder.setExtras(this.I00100l0);
/* 592 */           builder.setRemoteInputHistory(null);
/* 596 */           builder.setBadgeIconType(0);
/* 599 */           builder.setSettingsText(null);
/* 602 */           builder.setShortcutId(null);
/* 607 */           builder.setTimeoutAfter(0L);
/* 610 */           builder.setGroupAlertBehavior(0);
/* 619 */           if (!TextUtils.isEmpty(this.I0010o)) {
/* 633 */               builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                    }
/* 638 */           Iterator it3 = this.I0000Il00O.iterator();
/* 646 */           if (it3.hasNext()) {
/* 743 */               throw IIlIOloOOO.I000lI(it3);
                    }
/* 650 */           builder.setAllowSystemGeneratedContextualActions(this.I00111O);
/* 653 */           builder.setBubbleMetadata(null);
/* 660 */           if (Build.VERSION.SDK_INT >= 36) {
/* 662 */               I01o11oO.I0000oI00(builder);
                    }
/* 665 */           VarHandle.storeStoreFence();
/* 670 */           OIO0oiOO oIO0oiOO = (OIO0oiOO) olOO1i11110.I00iiO;
/* 672 */           I01O1lIi i01O1lIi = oIO0oiOO.I000l1;
/* 674 */           if (i01O1lIi != null) {
/* 676 */               i01O1lIi.I00lll10(olOO1i11110);
                    }
/* 679 */           Notification notificationBuild = builder.build();
/* 683 */           if (i01O1lIi != null) {
/* 687 */               oIO0oiOO.I000l1.getClass();
                    }
/* 690 */           if (i01O1lIi != null && (bundle = notificationBuild.extras) != null) {
/* 702 */               bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", i01O1lIi.I00oOio10iI1());
                    }
/* 705 */           return notificationBuild;
                }

                public final void I0000O(int i, boolean z) {
/* 1 */             Notification notification = this.I001IIilI0O;
/* 3 */             if (z) {
/* 8 */                 notification.flags = i | notification.flags;
                    } else {
/* 15 */                notification.flags = (~i) & notification.flags;
                    }
                }

                public final void I0000oI00(I01O1lIi i01O1lIi) {
/* 3 */             if (this.I000l1 != i01O1lIi) {
/* 5 */                 this.I000l1 = i01O1lIi;
/* 11 */                if (((OIO0oiOO) i01O1lIi.I00iOIl) != this) {
/* 13 */                    i01O1lIi.I00iOIl = this;
/* 15 */                    I0000oI00(i01O1lIi);
                        }
                    }
                }
            }
