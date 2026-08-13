            package p000;

            import android.os.Looper;
            import android.util.Log;
            
            public abstract class iOoO10 {
                public static ClassLoader I00000oIO;
                public static Thread I00000oOI;

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
                 */
                public static String I00000oIO(String str) {
/* 1 */             int iHashCode = str.hashCode();
                    switch (iHashCode) {
                        case -2061550653:
/* 838 */                   if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
/* 842 */                       return "kotlin.Double.Companion";
                            }
/* 840 */                   return null;
                        case -2056817302:
/* 826 */                   if (str.equals("java.lang.Integer")) {
/* 829 */                       return "kotlin.Int";
                            }
/* 840 */                   return null;
                        case -2034166429:
/* 814 */                   if (str.equals("java.lang.Cloneable")) {
/* 817 */                       return "kotlin.Cloneable";
                            }
/* 840 */                   return null;
                        case -1979556166:
/* 802 */                   if (str.equals("java.lang.annotation.Annotation")) {
/* 805 */                       return "kotlin.Annotation";
                            }
/* 840 */                   return null;
                        case -1571515090:
/* 790 */                   if (str.equals("java.lang.Comparable")) {
/* 793 */                       return "kotlin.Comparable";
                            }
/* 840 */                   return null;
                        case -1383349348:
/* 778 */                   if (str.equals("java.util.Map")) {
/* 781 */                       return "kotlin.collections.Map";
                            }
/* 840 */                   return null;
                        case -1383343454:
/* 766 */                   if (str.equals("java.util.Set")) {
/* 769 */                       return "kotlin.collections.Set";
                            }
/* 840 */                   return null;
                        case -1325958191:
/* 754 */                   if (str.equals("double")) {
/* 757 */                       return "kotlin.Double";
                            }
/* 840 */                   return null;
                        case -1182275604:
/* 742 */                   if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
/* 745 */                       return "kotlin.Byte.Companion";
                            }
/* 840 */                   return null;
                        case -1062240117:
/* 729 */                   if (str.equals("java.lang.CharSequence")) {
/* 733 */                       return "kotlin.CharSequence";
                            }
/* 840 */                   return null;
                        case -688322466:
/* 716 */                   if (str.equals("java.util.Collection")) {
/* 720 */                       return "kotlin.collections.Collection";
                            }
/* 840 */                   return null;
                        case -527879800:
/* 703 */                   if (str.equals("java.lang.Float")) {
/* 707 */                       return "kotlin.Float";
                            }
/* 840 */                   return null;
                        case -515992664:
/* 690 */                   if (str.equals("java.lang.Short")) {
/* 694 */                       return "kotlin.Short";
                            }
/* 840 */                   return null;
                        case -246476834:
/* 677 */                   if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
/* 681 */                       return "kotlin.Char.Companion";
                            }
/* 840 */                   return null;
                        case -207262728:
/* 664 */                   if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
/* 668 */                       return "kotlin.Long.Companion";
                            }
/* 840 */                   return null;
                        case -165139126:
/* 651 */                   if (str.equals("java.util.Map$Entry")) {
/* 655 */                       return "kotlin.collections.Map.Entry";
                            }
/* 840 */                   return null;
                        case 104431:
/* 641 */                   if (str.equals("int")) {
/* 829 */                       return "kotlin.Int";
                            }
/* 840 */                   return null;
                        case 3039496:
/* 628 */                   if (str.equals("byte")) {
/* 632 */                       return "kotlin.Byte";
                            }
/* 840 */                   return null;
                        case 3052374:
/* 615 */                   if (str.equals("char")) {
/* 619 */                       return "kotlin.Char";
                            }
/* 840 */                   return null;
                        case 3327612:
/* 602 */                   if (str.equals("long")) {
/* 606 */                       return "kotlin.Long";
                            }
/* 840 */                   return null;
                        case 64711720:
/* 589 */                   if (str.equals("boolean")) {
/* 593 */                       return "kotlin.Boolean";
                            }
/* 840 */                   return null;
                        case 65821278:
/* 576 */                   if (str.equals("java.util.List")) {
/* 580 */                       return "kotlin.collections.List";
                            }
/* 840 */                   return null;
                        case 77230534:
/* 563 */                   if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
/* 567 */                       return "kotlin.Short.Companion";
                            }
/* 840 */                   return null;
                        case 97526364:
/* 553 */                   if (str.equals("float")) {
/* 707 */                       return "kotlin.Float";
                            }
/* 840 */                   return null;
                        case 109413500:
/* 543 */                   if (str.equals("short")) {
/* 694 */                       return "kotlin.Short";
                            }
/* 840 */                   return null;
                        case 155276373:
/* 533 */                   if (str.equals("java.lang.Character")) {
/* 619 */                       return "kotlin.Char";
                            }
/* 840 */                   return null;
                        case 226173651:
/* 520 */                   if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
/* 524 */                       return "kotlin.Enum.Companion";
                            }
/* 840 */                   return null;
                        case 344809556:
/* 510 */                   if (str.equals("java.lang.Boolean")) {
/* 593 */                       return "kotlin.Boolean";
                            }
/* 840 */                   return null;
                        case 398507100:
/* 500 */                   if (str.equals("java.lang.Byte")) {
/* 632 */                       return "kotlin.Byte";
                            }
/* 840 */                   return null;
                        case 398585941:
/* 487 */                   if (str.equals("java.lang.Enum")) {
/* 491 */                       return "kotlin.Enum";
                            }
/* 840 */                   return null;
                        case 398795216:
/* 477 */                   if (str.equals("java.lang.Long")) {
/* 606 */                       return "kotlin.Long";
                            }
/* 840 */                   return null;
                        case 482629606:
/* 464 */                   if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
/* 468 */                       return "kotlin.Float.Companion";
                            }
/* 840 */                   return null;
                        case 499831342:
/* 451 */                   if (str.equals("java.util.Iterator")) {
/* 455 */                       return "kotlin.collections.Iterator";
                            }
/* 840 */                   return null;
                        case 577341676:
/* 438 */                   if (str.equals("java.util.ListIterator")) {
/* 442 */                       return "kotlin.collections.ListIterator";
                            }
/* 840 */                   return null;
                        case 599019395:
/* 425 */                   if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
/* 429 */                       return "kotlin.String.Companion";
                            }
/* 840 */                   return null;
                        case 761287205:
/* 415 */                   if (str.equals("java.lang.Double")) {
/* 757 */                       return "kotlin.Double";
                            }
/* 840 */                   return null;
                        case 1052881309:
/* 402 */                   if (str.equals("java.lang.Number")) {
/* 406 */                       return "kotlin.Number";
                            }
/* 840 */                   return null;
                        case 1063877011:
/* 389 */                   if (str.equals("java.lang.Object")) {
/* 393 */                       return "kotlin.Any";
                            }
/* 840 */                   return null;
                        case 1195259493:
/* 376 */                   if (str.equals("java.lang.String")) {
/* 380 */                       return "kotlin.String";
                            }
/* 840 */                   return null;
                        case 1275614662:
/* 363 */                   if (str.equals("java.lang.Iterable")) {
/* 367 */                       return "kotlin.collections.Iterable";
                            }
/* 840 */                   return null;
                        case 1383693018:
/* 350 */                   if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
/* 354 */                       return "kotlin.Boolean.Companion";
                            }
/* 840 */                   return null;
                        case 1630335596:
/* 337 */                   if (str.equals("java.lang.Throwable")) {
/* 341 */                       return "kotlin.Throwable";
                            }
/* 840 */                   return null;
                        case 1877171123:
/* 324 */                   if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
/* 328 */                       return "kotlin.Int.Companion";
                            }
/* 840 */                   return null;
                        default:
                            switch (iHashCode) {
                                case -1811142716:
/* 311 */                           if (str.equals("kotlin.jvm.functions.Function10")) {
/* 315 */                               return "kotlin.Function10";
                                    }
/* 840 */                           return null;
                                case -1811142715:
/* 298 */                           if (str.equals("kotlin.jvm.functions.Function11")) {
/* 302 */                               return "kotlin.Function11";
                                    }
/* 840 */                           return null;
                                case -1811142714:
/* 285 */                           if (str.equals("kotlin.jvm.functions.Function12")) {
/* 289 */                               return "kotlin.Function12";
                                    }
/* 840 */                           return null;
                                case -1811142713:
/* 272 */                           if (str.equals("kotlin.jvm.functions.Function13")) {
/* 276 */                               return "kotlin.Function13";
                                    }
/* 840 */                           return null;
                                case -1811142712:
/* 259 */                           if (str.equals("kotlin.jvm.functions.Function14")) {
/* 263 */                               return "kotlin.Function14";
                                    }
/* 840 */                           return null;
                                case -1811142711:
/* 246 */                           if (str.equals("kotlin.jvm.functions.Function15")) {
/* 250 */                               return "kotlin.Function15";
                                    }
/* 840 */                           return null;
                                case -1811142710:
/* 233 */                           if (str.equals("kotlin.jvm.functions.Function16")) {
/* 237 */                               return "kotlin.Function16";
                                    }
/* 840 */                           return null;
                                case -1811142709:
/* 220 */                           if (str.equals("kotlin.jvm.functions.Function17")) {
/* 224 */                               return "kotlin.Function17";
                                    }
/* 840 */                           return null;
                                case -1811142708:
/* 207 */                           if (str.equals("kotlin.jvm.functions.Function18")) {
/* 211 */                               return "kotlin.Function18";
                                    }
/* 840 */                           return null;
                                case -1811142707:
/* 194 */                           if (str.equals("kotlin.jvm.functions.Function19")) {
/* 198 */                               return "kotlin.Function19";
                                    }
/* 840 */                           return null;
                                default:
                                    switch (iHashCode) {
                                        case -1811142685:
/* 181 */                                   if (str.equals("kotlin.jvm.functions.Function20")) {
/* 185 */                                       return "kotlin.Function20";
                                            }
/* 840 */                                   return null;
                                        case -1811142684:
/* 168 */                                   if (str.equals("kotlin.jvm.functions.Function21")) {
/* 172 */                                       return "kotlin.Function21";
                                            }
/* 840 */                                   return null;
                                        case -1811142683:
/* 155 */                                   if (str.equals("kotlin.jvm.functions.Function22")) {
/* 159 */                                       return "kotlin.Function22";
                                            }
/* 840 */                                   return null;
                                        default:
                                            switch (iHashCode) {
                                                case 80123371:
/* 142 */                                           if (str.equals("kotlin.jvm.functions.Function0")) {
/* 146 */                                               return "kotlin.Function0";
                                                    }
/* 840 */                                           return null;
                                                case 80123372:
/* 129 */                                           if (str.equals("kotlin.jvm.functions.Function1")) {
/* 133 */                                               return "kotlin.Function1";
                                                    }
/* 840 */                                           return null;
                                                case 80123373:
/* 116 */                                           if (str.equals("kotlin.jvm.functions.Function2")) {
/* 120 */                                               return "kotlin.Function2";
                                                    }
/* 840 */                                           return null;
                                                case 80123374:
/* 103 */                                           if (str.equals("kotlin.jvm.functions.Function3")) {
/* 107 */                                               return "kotlin.Function3";
                                                    }
/* 840 */                                           return null;
                                                case 80123375:
/* 90 */                                            if (str.equals("kotlin.jvm.functions.Function4")) {
/* 94 */                                                return "kotlin.Function4";
                                                    }
/* 840 */                                           return null;
                                                case 80123376:
/* 77 */                                            if (str.equals("kotlin.jvm.functions.Function5")) {
/* 81 */                                                return "kotlin.Function5";
                                                    }
/* 840 */                                           return null;
                                                case 80123377:
/* 64 */                                            if (str.equals("kotlin.jvm.functions.Function6")) {
/* 68 */                                                return "kotlin.Function6";
                                                    }
/* 840 */                                           return null;
                                                case 80123378:
/* 51 */                                            if (str.equals("kotlin.jvm.functions.Function7")) {
/* 55 */                                                return "kotlin.Function7";
                                                    }
/* 840 */                                           return null;
                                                case 80123379:
/* 38 */                                            if (str.equals("kotlin.jvm.functions.Function8")) {
/* 42 */                                                return "kotlin.Function8";
                                                    }
/* 840 */                                           return null;
                                                case 80123380:
/* 25 */                                            if (str.equals("kotlin.jvm.functions.Function9")) {
/* 29 */                                                return "kotlin.Function9";
                                                    }
/* 840 */                                           return null;
                                                default:
/* 840 */                                           return null;
                                            }
                                    }
                            }
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
                 */
                public static String I00000oOI(String str) {
/* 1 */             int iHashCode = str.hashCode();
                    switch (iHashCode) {
                        case -2061550653:
/* 811 */                   if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case -2056817302:
/* 799 */                   if (str.equals("java.lang.Integer")) {
/* 802 */                       return "Int";
                            }
/* 813 */                   return null;
                        case -2034166429:
/* 787 */                   if (str.equals("java.lang.Cloneable")) {
/* 790 */                       return "Cloneable";
                            }
/* 813 */                   return null;
                        case -1979556166:
/* 775 */                   if (str.equals("java.lang.annotation.Annotation")) {
/* 778 */                       return "Annotation";
                            }
/* 813 */                   return null;
                        case -1571515090:
/* 763 */                   if (str.equals("java.lang.Comparable")) {
/* 766 */                       return "Comparable";
                            }
/* 813 */                   return null;
                        case -1383349348:
/* 751 */                   if (str.equals("java.util.Map")) {
/* 754 */                       return "Map";
                            }
/* 813 */                   return null;
                        case -1383343454:
/* 739 */                   if (str.equals("java.util.Set")) {
/* 742 */                       return "Set";
                            }
/* 813 */                   return null;
                        case -1325958191:
/* 727 */                   if (str.equals("double")) {
/* 730 */                       return OIllioIilO.I0111i;
                            }
/* 813 */                   return null;
                        case -1182275604:
/* 718 */                   if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case -1062240117:
/* 705 */                   if (str.equals("java.lang.CharSequence")) {
/* 709 */                       return "CharSequence";
                            }
/* 813 */                   return null;
                        case -688322466:
/* 692 */                   if (str.equals("java.util.Collection")) {
/* 696 */                       return "Collection";
                            }
/* 813 */                   return null;
                        case -527879800:
/* 679 */                   if (str.equals("java.lang.Float")) {
/* 683 */                       return "Float";
                            }
/* 813 */                   return null;
                        case -515992664:
/* 666 */                   if (str.equals("java.lang.Short")) {
/* 670 */                       return "Short";
                            }
/* 813 */                   return null;
                        case -246476834:
/* 656 */                   if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case -207262728:
/* 646 */                   if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case -165139126:
/* 633 */                   if (str.equals("java.util.Map$Entry")) {
/* 637 */                       return "Entry";
                            }
/* 813 */                   return null;
                        case 104431:
/* 623 */                   if (str.equals("int")) {
/* 802 */                       return "Int";
                            }
/* 813 */                   return null;
                        case 3039496:
/* 610 */                   if (str.equals("byte")) {
/* 614 */                       return "Byte";
                            }
/* 813 */                   return null;
                        case 3052374:
/* 597 */                   if (str.equals("char")) {
/* 601 */                       return "Char";
                            }
/* 813 */                   return null;
                        case 3327612:
/* 584 */                   if (str.equals("long")) {
/* 588 */                       return "Long";
                            }
/* 813 */                   return null;
                        case 64711720:
/* 571 */                   if (str.equals("boolean")) {
/* 575 */                       return "Boolean";
                            }
/* 813 */                   return null;
                        case 65821278:
/* 558 */                   if (str.equals("java.util.List")) {
/* 562 */                       return OIlllOo01.I00iio;
                            }
/* 813 */                   return null;
                        case 77230534:
/* 548 */                   if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case 97526364:
/* 538 */                   if (str.equals("float")) {
/* 683 */                       return "Float";
                            }
/* 813 */                   return null;
                        case 109413500:
/* 528 */                   if (str.equals("short")) {
/* 670 */                       return "Short";
                            }
/* 813 */                   return null;
                        case 155276373:
/* 518 */                   if (str.equals("java.lang.Character")) {
/* 601 */                       return "Char";
                            }
/* 813 */                   return null;
                        case 226173651:
/* 508 */                   if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case 344809556:
/* 498 */                   if (str.equals("java.lang.Boolean")) {
/* 575 */                       return "Boolean";
                            }
/* 813 */                   return null;
                        case 398507100:
/* 488 */                   if (str.equals("java.lang.Byte")) {
/* 614 */                       return "Byte";
                            }
/* 813 */                   return null;
                        case 398585941:
/* 475 */                   if (str.equals("java.lang.Enum")) {
/* 479 */                       return "Enum";
                            }
/* 813 */                   return null;
                        case 398795216:
/* 465 */                   if (str.equals("java.lang.Long")) {
/* 588 */                       return "Long";
                            }
/* 813 */                   return null;
                        case 482629606:
/* 455 */                   if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case 499831342:
/* 442 */                   if (str.equals("java.util.Iterator")) {
/* 446 */                       return "Iterator";
                            }
/* 813 */                   return null;
                        case 577341676:
/* 429 */                   if (str.equals("java.util.ListIterator")) {
/* 433 */                       return "ListIterator";
                            }
/* 813 */                   return null;
                        case 599019395:
/* 419 */                   if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case 761287205:
/* 409 */                   if (str.equals("java.lang.Double")) {
/* 730 */                       return OIllioIilO.I0111i;
                            }
/* 813 */                   return null;
                        case 1052881309:
/* 396 */                   if (str.equals("java.lang.Number")) {
/* 400 */                       return "Number";
                            }
/* 813 */                   return null;
                        case 1063877011:
/* 383 */                   if (str.equals("java.lang.Object")) {
/* 387 */                       return "Any";
                            }
/* 813 */                   return null;
                        case 1195259493:
/* 370 */                   if (str.equals("java.lang.String")) {
/* 374 */                       return "String";
                            }
/* 813 */                   return null;
                        case 1275614662:
/* 357 */                   if (str.equals("java.lang.Iterable")) {
/* 361 */                       return "Iterable";
                            }
/* 813 */                   return null;
                        case 1383693018:
/* 347 */                   if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        case 1630335596:
/* 334 */                   if (str.equals("java.lang.Throwable")) {
/* 338 */                       return "Throwable";
                            }
/* 813 */                   return null;
                        case 1877171123:
/* 324 */                   if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
/* 815 */                       return "Companion";
                            }
/* 813 */                   return null;
                        default:
                            switch (iHashCode) {
                                case -1811142716:
/* 311 */                           if (str.equals("kotlin.jvm.functions.Function10")) {
/* 315 */                               return "Function10";
                                    }
/* 813 */                           return null;
                                case -1811142715:
/* 298 */                           if (str.equals("kotlin.jvm.functions.Function11")) {
/* 302 */                               return "Function11";
                                    }
/* 813 */                           return null;
                                case -1811142714:
/* 285 */                           if (str.equals("kotlin.jvm.functions.Function12")) {
/* 289 */                               return "Function12";
                                    }
/* 813 */                           return null;
                                case -1811142713:
/* 272 */                           if (str.equals("kotlin.jvm.functions.Function13")) {
/* 276 */                               return "Function13";
                                    }
/* 813 */                           return null;
                                case -1811142712:
/* 259 */                           if (str.equals("kotlin.jvm.functions.Function14")) {
/* 263 */                               return "Function14";
                                    }
/* 813 */                           return null;
                                case -1811142711:
/* 246 */                           if (str.equals("kotlin.jvm.functions.Function15")) {
/* 250 */                               return "Function15";
                                    }
/* 813 */                           return null;
                                case -1811142710:
/* 233 */                           if (str.equals("kotlin.jvm.functions.Function16")) {
/* 237 */                               return "Function16";
                                    }
/* 813 */                           return null;
                                case -1811142709:
/* 220 */                           if (str.equals("kotlin.jvm.functions.Function17")) {
/* 224 */                               return "Function17";
                                    }
/* 813 */                           return null;
                                case -1811142708:
/* 207 */                           if (str.equals("kotlin.jvm.functions.Function18")) {
/* 211 */                               return "Function18";
                                    }
/* 813 */                           return null;
                                case -1811142707:
/* 194 */                           if (str.equals("kotlin.jvm.functions.Function19")) {
/* 198 */                               return "Function19";
                                    }
/* 813 */                           return null;
                                default:
                                    switch (iHashCode) {
                                        case -1811142685:
/* 181 */                                   if (str.equals("kotlin.jvm.functions.Function20")) {
/* 185 */                                       return "Function20";
                                            }
/* 813 */                                   return null;
                                        case -1811142684:
/* 168 */                                   if (str.equals("kotlin.jvm.functions.Function21")) {
/* 172 */                                       return "Function21";
                                            }
/* 813 */                                   return null;
                                        case -1811142683:
/* 155 */                                   if (str.equals("kotlin.jvm.functions.Function22")) {
/* 159 */                                       return "Function22";
                                            }
/* 813 */                                   return null;
                                        default:
                                            switch (iHashCode) {
                                                case 80123371:
/* 142 */                                           if (str.equals("kotlin.jvm.functions.Function0")) {
/* 146 */                                               return "Function0";
                                                    }
/* 813 */                                           return null;
                                                case 80123372:
/* 129 */                                           if (str.equals("kotlin.jvm.functions.Function1")) {
/* 133 */                                               return "Function1";
                                                    }
/* 813 */                                           return null;
                                                case 80123373:
/* 116 */                                           if (str.equals("kotlin.jvm.functions.Function2")) {
/* 120 */                                               return "Function2";
                                                    }
/* 813 */                                           return null;
                                                case 80123374:
/* 103 */                                           if (str.equals("kotlin.jvm.functions.Function3")) {
/* 107 */                                               return "Function3";
                                                    }
/* 813 */                                           return null;
                                                case 80123375:
/* 90 */                                            if (str.equals("kotlin.jvm.functions.Function4")) {
/* 94 */                                                return "Function4";
                                                    }
/* 813 */                                           return null;
                                                case 80123376:
/* 77 */                                            if (str.equals("kotlin.jvm.functions.Function5")) {
/* 81 */                                                return "Function5";
                                                    }
/* 813 */                                           return null;
                                                case 80123377:
/* 64 */                                            if (str.equals("kotlin.jvm.functions.Function6")) {
/* 68 */                                                return "Function6";
                                                    }
/* 813 */                                           return null;
                                                case 80123378:
/* 51 */                                            if (str.equals("kotlin.jvm.functions.Function7")) {
/* 55 */                                                return "Function7";
                                                    }
/* 813 */                                           return null;
                                                case 80123379:
/* 38 */                                            if (str.equals("kotlin.jvm.functions.Function8")) {
/* 42 */                                                return "Function8";
                                                    }
/* 813 */                                           return null;
                                                case 80123380:
/* 25 */                                            if (str.equals("kotlin.jvm.functions.Function9")) {
/* 29 */                                                return "Function9";
                                                    }
/* 813 */                                           return null;
                                                default:
/* 813 */                                           return null;
                                            }
                                    }
                            }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x00b8 A[Catch: all -> 0x00b4, PHI: r2
                  0x00b8: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:62:0x00e7, B:12:0x0023, B:52:0x00b7, B:53:0x00b8, B:65:0x00eb, B:54:0x00b9, B:60:0x00e5, B:59:0x00c3, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040), top: B:77:0x0003, inners: #0, #3 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static synchronized ClassLoader I0000Il00O() {
                    ClassLoader classLoader;
                    SecurityException e;
                    Thread thread;
                    ThreadGroup threadGroup;
/* 4 */             classLoader = I00000oIO;
/* 6 */             if (classLoader == null) {
/* 10 */                Thread thread2 = I00000oOI;
/* 12 */                ClassLoader contextClassLoader = null;
/* 13 */                if (thread2 != null) {
                            synchronized (thread2) {
                                try {
/* 188 */                           contextClassLoader = I00000oOI.getContextClassLoader();
                                } catch (SecurityException e2) {
/* 198 */                           String message = e2.getMessage();
/* 214 */                           StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
/* 217 */                           sb.append("Failed to get thread context classloader ");
/* 220 */                           sb.append(message);
/* 227 */                           Log.w("DynamiteLoaderV2CL", sb.toString());
                                }
                            }
/* 179 */                   classLoader = contextClassLoader;
/* 232 */                   I00000oIO = classLoader;
                        } else {
/* 23 */                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
/* 29 */                    if (threadGroup2 == null) {
/* 31 */                        thread2 = null;
                            } else {
                                synchronized (Void.class) {
                                    try {
                                        try {
/* 37 */                                    int iActiveGroupCount = threadGroup2.activeGroupCount();
/* 41 */                                    ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
/* 43 */                                    threadGroup2.enumerate(threadGroupArr);
/* 46 */                                    int i = 0;
/* 47 */                                    int i2 = 0;
                                            while (true) {
/* 48 */                                        if (i2 >= iActiveGroupCount) {
/* 73 */                                            threadGroup = null;
                                                    break;
                                                }
/* 50 */                                        threadGroup = threadGroupArr[i2];
/* 62 */                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                                    break;
                                                }
/* 65 */                                        i2++;
                                            }
/* 74 */                                    if (threadGroup == null) {
/* 80 */                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                            }
/* 83 */                                    int iActiveCount = threadGroup.activeCount();
/* 87 */                                    Thread[] threadArr = new Thread[iActiveCount];
/* 89 */                                    threadGroup.enumerate(threadArr);
                                            while (true) {
/* 92 */                                        if (i >= iActiveCount) {
/* 112 */                                           thread = null;
                                                    break;
                                                }
/* 94 */                                        thread = threadArr[i];
/* 106 */                                       if ("GmsDynamite".equals(thread.getName())) {
                                                    break;
                                                }
/* 109 */                                       i++;
                                            }
/* 113 */                                   if (thread == null) {
                                                try {
/* 119 */                                           I1OoI100 i1OoI100 = new I1OoI100(threadGroup, "GmsDynamite");
                                                    try {
/* 122 */                                               i1OoI100.setContextClassLoader(null);
/* 125 */                                               i1OoI100.start();
/* 128 */                                               thread = i1OoI100;
                                                    } catch (SecurityException e3) {
/* 130 */                                               e = e3;
/* 131 */                                               thread = i1OoI100;
/* 141 */                                               String message2 = e.getMessage();
/* 157 */                                               StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
/* 160 */                                               sb2.append("Failed to enumerate thread/threadgroup ");
/* 163 */                                               sb2.append(message2);
/* 170 */                                               Log.w("DynamiteLoaderV2CL", sb2.toString());
/* 174 */                                               thread2 = thread;
/* 175 */                                               I00000oOI = thread2;
/* 177 */                                               if (thread2 != null) {
                                                        }
/* 179 */                                               classLoader = contextClassLoader;
/* 232 */                                               I00000oIO = classLoader;
/* 238 */                                               return classLoader;
                                                    }
                                                } catch (SecurityException e4) {
/* 133 */                                           e = e4;
                                                }
                                            }
                                        } finally {
                                        }
                                    } catch (SecurityException e5) {
/* 137 */                               e = e5;
/* 138 */                               thread = null;
                                    }
                                }
/* 174 */                       thread2 = thread;
                            }
/* 175 */                   I00000oOI = thread2;
/* 177 */                   if (thread2 != null) {
                            }
/* 179 */                   classLoader = contextClassLoader;
/* 232 */                   I00000oIO = classLoader;
                        }
                    }
/* 238 */           return classLoader;
                }
            }
