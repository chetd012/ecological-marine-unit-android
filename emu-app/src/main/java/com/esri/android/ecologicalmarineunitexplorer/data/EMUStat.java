/* Copyright 2017 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For additional information, contact:
 * Environmental Systems Research Institute, Inc.
 * Attn: Contracts Dept
 * 380 New York Street
 * Redlands, California, USA 92373
 *
 * email: contracts@esri.com
 *
 */

package com.esri.android.ecologicalmarineunitexplorer.data;


public class EMUStat {

  public int getEmu_name() {
    return emu_name;
  }

  public void setEmu_name(final int emu_name) {
    this.emu_name = emu_name;
  }

  private int emu_name = 0;

  private Double temp_min = null;
  private Double temp_max = null;
  private Double temp_mean = null;

  private Double salinity_min = null;
  private Double salinity_max = null;
  private Double salinity_mean = null;

  private Double disso2_min = null;
  private Double disso2_max = null;
  private Double disso2_mean = null;

  private Double phosphate_min = null;
  private Double phosphate_max = null;
  private Double phosphate_mean = null;

  private Double silicate_min = null;
  private Double silicate_max = null;
  private Double silicate_mean = null;

  private Double nitrate_min = null;
  private Double nitrate_max = null;
  private Double nitrate_mean = null;

  public Double getTemp_min() {
    return temp_min;
  }

  public void setTemp_min(final Double temp_min) {
    this.temp_min = temp_min;
  }

  public Double getTemp_max() {
    return temp_max;
  }

  public void setTemp_max(final Double temp_max) {
    this.temp_max = temp_max;
  }

  public Double getTemp_mean() {
    return temp_mean;
  }

  public void setTemp_mean(final Double temp_mean) {
    this.temp_mean = temp_mean;
  }

  public Double getSalinity_min() {
    return salinity_min;
  }

  public void setSalinity_min(final Double salinity_min) {
    this.salinity_min = salinity_min;
  }

  public Double getSalinity_max() {
    return salinity_max;
  }

  public void setSalinity_max(final Double salinity_max) {
    this.salinity_max = salinity_max;
  }

  public Double getSalinity_mean() {
    return salinity_mean;
  }

  public void setSalinity_mean(final Double salinity_mean) {
    this.salinity_mean = salinity_mean;
  }

  public Double getDisso2_min() {
    return disso2_min;
  }

  public void setDisso2_min(final Double disso2_min) {
    this.disso2_min = disso2_min;
  }

  public Double getDisso2_max() {
    return disso2_max;
  }

  public void setDisso2_max(final Double disso2_max) {
    this.disso2_max = disso2_max;
  }

  public Double getDisso2_mean() {
    return disso2_mean;
  }

  public void setDisso2_mean(final Double disso2_mean) {
    this.disso2_mean = disso2_mean;
  }

  public Double getPhosphate_min() {
    return phosphate_min;
  }

  public void setPhosphate_min(final Double phosphate_min) {
    this.phosphate_min = phosphate_min;
  }

  public Double getPhosphate_max() {
    return phosphate_max;
  }

  public void setPhosphate_max(final Double phosphate_max) {
    this.phosphate_max = phosphate_max;
  }

  public Double getPhosphate_mean() {
    return phosphate_mean;
  }

  public void setPhosphate_mean(final Double phosphate_mean) {
    this.phosphate_mean = phosphate_mean;
  }

  public Double getSilicate_min() {
    return silicate_min;
  }

  public void setSilicate_min(final Double silicate_min) {
    this.silicate_min = silicate_min;
  }

  public Double getSilicate_max() {
    return silicate_max;
  }

  public void setSilicate_max(final Double silicate_max) {
    this.silicate_max = silicate_max;
  }

  public Double getSilicate_mean() {
    return silicate_mean;
  }

  public void setSilicate_mean(final Double silicate_mean) {
    this.silicate_mean = silicate_mean;
  }

  public Double getNitrate_min() {
    return nitrate_min;
  }

  public void setNitrate_min(final Double nitrate_min) {
    this.nitrate_min = nitrate_min;
  }

  public Double getNitrate_max() {
    return nitrate_max;
  }

  public void setNitrate_max(final Double nitrate_max) {
    this.nitrate_max = nitrate_max;
  }

  public Double getNitrate_mean() {
    return nitrate_mean;
  }

  public void setNitrate_mean(final Double nitrate_mean) {
    this.nitrate_mean = nitrate_mean;
  }

  @Override public String toString() {
    return "EMUStat{" +
        "temp_min=" + temp_min +
        ", temp_max=" + temp_max +
        ", temp_mean=" + temp_mean +
        ", salinity_min=" + salinity_min +
        ", salinity_max=" + salinity_max +
        ", salinity_mean=" + salinity_mean +
        ", disso2_min=" + disso2_min +
        ", disso2_max=" + disso2_max +
        ", disso2_mean=" + disso2_mean +
        ", phosphate_min=" + phosphate_min +
        ", phosphate_max=" + phosphate_max +
        ", phosphate_mean=" + phosphate_mean +
        ", silicate_min=" + silicate_min +
        ", silicate_max=" + silicate_max +
        ", silicate_mean=" + silicate_mean +
        ", nitrate_min=" + nitrate_min +
        ", nitrate_max=" + nitrate_max +
        ", nitrate_mean=" + nitrate_mean +
        '}';
  }
}
